package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number of element");
        int x = sc.nextInt();
        System.out.println("Enter  numbers");
        int sum = 0, average = 0, multiply = 1;
        for (int i = 0; i < x; i++) {
            int y = sc.nextInt();
            list.add(y);
            sum = sum + y;
            multiply = multiply * y;
            average = sum / list.size();
        }
        int min = Collections.min(list);
        int max = Collections.max((list));
        String s = "N";
        do {
            System.out.println(" Choose any one  option from these 1.min/2.max/3.average/4.sum/5.multiply......");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Minimum value is" + " " + min);
                    break;
                case 2:
                    System.out.println("Maximum is" + " " + max);
                    break;
                case 3:
                    System.out.println("Average is" + " " + average);
                    break;
                case 4:
                    System.out.println("sum of all numbers is" + " " + sum);
                    break;
                case 5:
                    System.out.println("Multiplication of all number is" + " " + multiply);
                    break;
            }
            System.out.println("Want to exit or not" + " Y/N ?");
            s = sc.next();

        } while (!s.equalsIgnoreCase("Y"));
        System.out.println("Have a good day....");
    }
}
