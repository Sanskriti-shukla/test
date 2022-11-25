package com.company.PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ArrAddDynamic {
    public static void main(String[] args) {
        List<Integer> addition = new ArrayList<>();
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array one by one ");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are: " + Arrays.toString(myArray));
        System.out.println("Enter the number of element you want to add..!");
        int n = sc.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            int sum = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (i != j) {
                    sum = sum + myArray[j];
                }
            }
            System.out.println(sum);
            addition.add(sum);
            System.out.println(addition);
        }
    }
}



