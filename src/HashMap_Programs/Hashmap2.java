package HashMap_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Hashmap2 {
    String name;
    String division;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student..!");
        int n = sc.nextInt();
        List<Hashmap2> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the name...!");
            String name = sc.next();
            System.out.println("Enter the division..!");
            String division = sc.next();
            Hashmap2 hm = new Hashmap2();
            hm.setName(name);
            hm.setDivision(division);
            list.add(hm);
        }
        System.out.println(list);
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        for (Hashmap2 hashmap2 : list) {
            if (hashmap2.getDivision().equals("A")) {
                L1.add(hashmap2.getName());
            } else if (hashmap2.getDivision().equals("B")) {
                L2.add(hashmap2.getName());
            }
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        hashMap.put("A", L1);
        hashMap.put("B", L2);
        System.out.println(hashMap);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Hashmap2{" +
                "name='" + name + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
