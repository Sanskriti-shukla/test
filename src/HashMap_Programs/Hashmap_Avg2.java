package HashMap_Programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

interface Avg {
    void FindAvg(List<Integer> hm);

    void findMin(List<Integer> hm);

    void findMax(List<Integer> hm);

}

class Avg2 implements Avg {

    @Override
    public void FindAvg(List<Integer> hm) {
        int sum = 0, average;
        for (Integer value : hm) {
            sum = sum + value;
        }
        average = sum / hm.size();
        System.out.println(average);
    }

    @Override
    public void findMin(List<Integer> hm) {
        int min = Collections.min(hm);
        System.out.println(min);
    }

    @Override
    public void findMax(List<Integer> hm) {
        int max = Collections.max(hm);
        System.out.println(max);
    }
}

public class Hashmap_Avg2 {
    private static Object String;

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Student");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the name");
            String key = sc.next();
            System.out.println("Enter the marks");
            int values = sc.nextInt();
            hm.put(key, values);
            System.out.println(hm.values());
        }
        Avg a = new Avg2();
        List<Integer> list = hm.values().stream().collect(Collectors.toList());
//      a.FindAvg(list);
        String s = "N";
        do {
            System.out.println("  System.out.println(\" Choose any one  option from these 1.average/2.max/3.min......\")");
            int n2 = sc.nextInt();
            switch (n2) {
                case 1:
                    a.FindAvg(list);
                    break;
                case 2:
                    a.findMax(list);
                    break;
                case 3:
                    a.findMin(list);
                    break;
            }
            System.out.println("Do you want to exit ?.. Y/N.");
            s = sc.next();

        }
        while (s.equalsIgnoreCase("N"));
        System.out.println("Have  a good day...");


    }
}

