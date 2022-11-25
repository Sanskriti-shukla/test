package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    String name;
    int grade;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of student");
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter grade");
            int grade = sc.nextInt();
            Student student = new Student();
            student.setName(name);
            student.setGrade(grade);
            list.add(student);
        }
        System.out.println(MinGradeStudent(list));
    }

    private static String MinGradeStudent(List<Student> list) {
        int min = list.get(0).grade;
        String name = list.get(0).name;
        for (Student student : list) {
            if (min > list.get(0).grade) {
                min = list.get(0).grade;
            }
        }
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
