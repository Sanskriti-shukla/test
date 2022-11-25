package com.company.PRACTICE;

import java.util.Scanner;

public class HCF_NUMBER {
    public static void main(String[] args) {
       int n1=12, n2=60, hcf=0;
       for (int i=1; i<=n1|| i<=2; i++){
           if (n1%i==0 && n2%i==0){
               hcf=i;
           } }
        System.out.println(hcf);
    }
}

