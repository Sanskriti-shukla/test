package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxGrade {
    String name;
    int grade;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student");
        int n = sc.nextInt();
        List<MaxGrade> MAX = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            System.out.println("Enter name" + " ");
            String name = sc.next();

            System.out.println("Enter grade" + " ");
            int grade = sc.nextInt();
            MaxGrade maxGrade = new MaxGrade();
            maxGrade.setName(name);
            maxGrade.setGrade(grade);
            MAX.add(maxGrade);
            System.out.println(getMinimumGrade(MAX));
        }
    }

    private static String getMinimumGrade(List<MaxGrade> MAX) {
        int max = MAX.get(0).getGrade();
        String name = MAX.get(0).getName();
        for (MaxGrade maxGrade : MAX) {
            if (max < maxGrade.grade) {
                max = maxGrade.getGrade();
                name = maxGrade.getName();
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
