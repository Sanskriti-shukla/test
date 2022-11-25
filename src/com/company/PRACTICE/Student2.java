package com.company.PRACTICE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Student2 {
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
        return "Student2{" +
                "Division='" + Division + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        System.out.println("Enter the input");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        List<Student2> list= new ArrayList<>();
        for (int i=1; i<=n; i++){
        System.out.println("Enter the name:");
        String  name=sc.next();
            System.out.println("Enter the Division:");
            String  Division=sc.next();
            Student2 s2= new Student2();
            s2.setName(name);
            s2.setDivision(Division);
            list.add(s2);

    }
        System.out.println( list);
        int count=0;
        int count1=0;
        List<String> l1= new ArrayList<>();
        List<String> l2= new ArrayList<>();
        for (Student2 student2 : list) {

            if (student2.getDivision().equals("A")){
           count+=1;
           l1.add(student2.getName());
            } else if (student2.getDivision().equals("B")) {
                count1+=1;
                l2.add(student2.getDivision());

            }
        }
        HashMap<String,Integer> hashMap= new HashMap<>();
        hashMap.put("A",count);
        hashMap.put("B,", count1);
        System.out.println(hashMap.toString());

        HashMap<String,List<String> > hashMap1= new HashMap<>();
        hashMap1.put("A", l1);
        hashMap1.put("B",l2 );
        System.out.println(hashMap1.toString());

    }

}
