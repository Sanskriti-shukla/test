package com.company.PRACTICE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student3 {
    int grade;
 String name;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of students");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Name: ");
            String name = sc.next();
//            String name = sc.nextLine();
            System.out.println("Grade: ");
            int grade = sc.nextInt();
            List arrayList = new ArrayList();
              arrayList.add(name);
              arrayList.add(grade);


        }
    }}
