package Threads;

import java.util.Scanner;

class ThreadExample2 extends Thread{
    public static void main(String args[])  {
         Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();
            for (int i=0; i<=n; i++){
                System.out.println(i);
                try {
                    sleep(200);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } } }}
