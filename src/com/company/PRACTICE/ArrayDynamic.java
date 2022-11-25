package com.company.PRACTICE;

import java.util.*;

public class ArrayDynamic {
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

                if (i != j)

                    sum = sum + myArray[i];
            }
            System.out.println(sum);
            addition.add(sum);
            System.out.println(addition);
        }
        System.out.println(FindMaxElement(addition));
        System.out.println(FindMinElement(addition));

    }
    private static int FindMinElement(List<Integer> addition) {
        if (addition == null || addition.size() == 0) {
            return Integer.MAX_VALUE;
        }
        return Collections.min(addition);

    }
    private static int FindMaxElement(List<Integer> addition) {
        if (addition == null || addition.size() == 0) {
            return Integer.MIN_VALUE;
        }
        return Collections.max(addition);
    }
}
