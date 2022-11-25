package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency_count {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        System.out.println(hashMap);
    }
}

