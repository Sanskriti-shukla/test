package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Line_Print1 {
    public static void readFileasLine(String fileName) throws IOException {
        List<String> list = new ArrayList<>();
        FileReader fr = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fr);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line + " ");
            String[] words = line.split("\\s");
            Collections.addAll(list, words);
        }
        System.out.println(list);
        Map<String, Integer> hashMap = new HashMap<>();
        Set<String> s = new HashSet<String>(list);
        System.out.println(s);
        for (String words : s) {
            int frequencyOfWord = Collections.frequency(list, words);
//            if (frequencyOfWord>10) {
            System.out.println(frequencyOfWord);
            if (frequencyOfWord > 2) {
                hashMap.put(words, frequencyOfWord);
            }
        }
//        hashMap.values().toArray();
        System.out.println(hashMap);
//        HashMap in ascending order....
        System.out.println("     ");

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        System.out.println("sorted map :" + sortedMap);
        int i = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : sortedMap.entrySet()) {
            if (i > 10) {
                break;
            } else {
                System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
                i++;
            }
        }
        System.out.println("   ");

//        Hashmap in descending order..
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        System.out.println("Reverse Sorted Map   : " + reverseSortedMap);
        i = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : reverseSortedMap.entrySet()) {
            if (i > 10) {
                break;
            } else {
                System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
                i++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        readFileasLine("C:\\Users\\TRPC05\\Desktop\\bubble-1.1\\Test project\\file2.txt");


    }
}
