package com.company.PRACTICE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
interface Numbers2{
    int findAvg(List<Integer> list);
    int findMax(List<Integer> list);
    int findMin(List<Integer> list);
}
class Numbers3 implements Numbers2 {
    @Override
    public int findAvg(List<Integer> list) {
        int sum=0,average;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        average=sum/list.size();
        System.out.println(average);
        return sum;
    }

    @Override
    public int findMax(List<Integer> list) {
        int max= Collections.max(list);
        System.out.println(max);
        return max;
    }

    @Override
    public int findMin(List<Integer> list) {
        int min=Collections.min(list);
        System.out.println(min);
        return min;
    }
}
class Main5{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of list");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the element one by one");
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            list.add(n);
        }
        Numbers3 n1=new Numbers3();

//        n1.findAvg(list);
//        n1.findMax(list);
//        n1.findMin(list);

        System.out.println("Enter case....");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> n1.findAvg(list);
            case 2 -> n1.findMin(list);
            case 3 -> n1.findMax(list);
        }

    }
}

