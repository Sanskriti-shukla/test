package com.company.PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<Integer> primeNumbers=new ArrayList<>();
      primeNumbers.addAll(Arrays.asList(2,7,3));
        System.out.println(primeNumbers);
        primeNumbers.addAll(1,Arrays.asList(9,11));
        System.out.println(primeNumbers);
        String a[] = new String[] {"A","B","C","D"};
//        System.out.println(a);
        List<Integer> list= new ArrayList<>();
        System.out.println(Arrays.asList(a));

    }
}
