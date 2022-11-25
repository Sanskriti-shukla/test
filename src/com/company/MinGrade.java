package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinGrade {
    String name;
    int grade;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of student");
        int n = sc.nextInt();
        List<MinGrade> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            System.out.println("Name: ");
            String name = sc.next();
//            String name = sc.nextLine();
            System.out.println("Grade: ");
            int grade = sc.nextInt();
            MinGrade minGrade = new MinGrade();
            minGrade.setGrade(grade);
            minGrade.setName(name);
            list.add(minGrade);
            System.out.println(getMinimumGradeStudent(list));

        }
    }

    private static String getMinimumGradeStudent(List<MinGrade> list) {
        int min = list.get(0).getGrade();
        String name = list.get(0).getName();
        for (MinGrade minGrade : list) {
            if (min > minGrade.getGrade()) {
                min = minGrade.getGrade();
                name = minGrade.getName();
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
