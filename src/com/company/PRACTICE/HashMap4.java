package com.company.PRACTICE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMap4 {
    String Division;
    String name;

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HashMap4{" +
                "Division='" + Division + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<HashMap4> hm = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the division");
            String Division = sc.next();
            HashMap4 H = new HashMap4();
            H.setName(name);
            H.setDivision(Division);
            hm.add(H);
        }
//        System.out.println(hm);
//        int Count=0;
//        int Count1=0;
        for (HashMap4 hashMap4 : hm) {


            HashMap<String, String> hashMap= new HashMap<>();
            hashMap.put("A", hashMap4.name);
            hashMap.put("B",hashMap4.name);
            System.out.println(hashMap);


        }



    }

}
