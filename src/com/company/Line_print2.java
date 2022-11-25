package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Line_print2 {
    public static void LinePrint(String filename) throws IOException {
        List<String> list = new ArrayList<>();
        FileReader f = new FileReader(filename);
        BufferedReader reader = new BufferedReader(f);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line + " ");
            String[] words = line.split("\\s");
            list.add(line);
            Collections.addAll(list, words);
        }
        System.out.println(list);
        HashMap<String, Integer> hashMap = new HashMap<>();
        Set<String> s = new HashSet<>(list);
        System.out.println(s);
        for (String words : s) {
            int frequency = Collections.frequency(list, words);
            System.out.println(frequency);
            hashMap.put(words, frequency);

        }
        System.out.println(hashMap);
        System.out.println("    ");

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        hashMap.entrySet().

                stream().

                forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        System.out.println("Sorted Map" + " " + sortedMap);
        int i = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : sortedMap.entrySet()) {
            if (i > 10) {
                break;
            } else {
                System.out.println(stringIntegerEntry.getValue() + " " + stringIntegerEntry.getKey());
                i++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        LinePrint("C:\\\\Users\\\\TRPC05\\\\Desktop\\\\bubble-1.1\\\\Test project\\\\file2.txt");

    }
}
