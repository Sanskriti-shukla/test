package Interface_Programs;
//  Task-  using interface find out average of numbers and max and min of numbers..

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

interface Numbers1 {
    void findAvg(List<Integer> list);

    void findMax(List<Integer> list);

    void findMin(List<Integer> list);
}

class Average_2 implements Numbers1 {
    @Override
    public void findAvg(List<Integer> list) {
        int sum = 0, average;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        average = sum / list.size();
        System.out.println(average);
    }

    @Override
    public void findMax(List<Integer> list) {
        int max = Collections.max(list);
        System.out.println(max);
    }

    @Override
    public void findMin(List<Integer> list) {
        int min = Collections.min(list);
        System.out.println(min);
    }
}

class Main5 {
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
        Numbers1 n1 = new Average_2();
        n1.findAvg(list);
        n1.findMax(list);
        n1.findMin(list);

    }
}

