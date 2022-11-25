package com.company.PRACTICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
    int grade;
    String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student");
        int n = sc.nextInt();
        List<A> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("enter grade");
            int grade = sc.nextInt();
            A a1 = new A();
            a1.setGrade(grade);
            a1.setName(name);
            a.add(a1);
            System.out.println(FindMaximumGrade(a));
        }
    }
    private static String FindMaximumGrade(List<A> a) {
        int max = a.get(0).grade;
        String name = a.get(0).name;
        for (A a1 : a) {
            if (max < a1.grade) {
                max = a1.getGrade();
                name = a1.getName();
            }
        }
        return name;
    }
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
