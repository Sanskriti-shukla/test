package com.company.PRACTICE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class

ArrayAddition {
    public static void main(String[] args) {
        List<Integer> addition = new ArrayList<>();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    sum = sum + arr[j];
                }
            }
            System.out.println(sum);
            addition.add(sum);
            System.out.println(addition);

        }
//        Declare two method one is for find max_element and second is for find min_element
        System.out.println(FindMaxElement(addition));
        System.out.println(FindMinElement(addition));

    }

    private static int FindMinElement(List<Integer> addition) {
        if (addition == null || addition.size() == 0) {
            return Integer.MIN_VALUE;
        }
        return Collections.max(addition);
    }
    private static int FindMaxElement(List<Integer> addition) {
        if (addition == null || addition.size() == 0) {
            return Integer.MAX_VALUE;
        }
        return Collections.min(addition);
    }

}

