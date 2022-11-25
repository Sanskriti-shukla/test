package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Hashmap6 {
    String name;
    String division;
    public static void main(String[] args) {
        System.out.println("Enter the number of student you want..");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Hashmap6> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name....");
            String name = sc.next();
            System.out.println("Enter the grade..");
            String division = sc.next();
            Hashmap6 H = new Hashmap6();
            H.setName(name);
            H.setDivision(division);
            list.add(H);
        }
        System.out.println(list);
        int count = 0;
        int count1 = 0;
        for (Hashmap6 hashmap6 : list) {
            if (hashmap6.getDivision().equals("A")) {
                count += 1;
            } else if (hashmap6.getDivision().equals("B")) {
                count1 += 1;
            }
        }
        HashMap<String, Integer> H1 = new HashMap<>();
        H1.put("A", count);
        H1.put("B", count1);
        System.out.println(H1);
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
        return "Hashmap6{" +
                "name='" + name + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}


