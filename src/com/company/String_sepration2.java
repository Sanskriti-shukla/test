package com.company;

import java.util.Scanner;

public class String_sepration2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        String[] arr1 = s.split(",");
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            count = 0;
            for (int j = 0; j < arr1.length; j++) {
                String temp = arr1[j];
                String temp1 = arr1[i];
                if (j < i && temp.contentEquals(temp1)) {
                    break;
                }
                if (temp.contentEquals(temp1)) {
                    count = count + 1;
                }
                if (j == arr1.length - 1) {
                    System.out.println(arr1[i] + "=" + count);
                }
            }
        }
    }
}
