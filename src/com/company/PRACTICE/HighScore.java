package com.company.PRACTICE;

import java.util.Scanner;

public class HighScore {
    String name;
    int grade;

        public static void main(String[]args) {
            Scanner x = new Scanner(System.in);
            System.out.println("enter number of student");
            int n=x.nextInt();
            String name = "";
             int grade;
            int highest = 0;
            for (int i = 1; i <=n ; i++) {
                System.out.println("Enter name: ");
               String s=x.next();
                System.out.println("Enter score: ");
               int num = x.nextInt();
                if (num > highest) {
                    highest = num;
                }
            }
            System.out.println(highest+" "+"is highest grade  achieved by"+" "+name);
        }
    }

