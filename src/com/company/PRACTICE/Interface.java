package com.company.PRACTICE;

import java.util.Scanner;

interface Numbers{
    int process(int x,int y);
}
 class Interface implements Numbers {

     @Override
     public int process(int x, int y) {
         return ((x+y)/2);
     }

     public static void main(String[] args) {
         int x, y;
         Interface avg= new Interface();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         x=sc.nextInt();
         System.out.println("Enter a number");
         y=sc.nextInt();
         System.out.println("Average"+ "="+avg.process(x,y));
     }
 }
