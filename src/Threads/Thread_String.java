package Threads;

import java.util.Scanner;

public class Thread_String extends Thread {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter name..!");
        for (int i=0; i<=n; i++) {
            String name = sc.next();

            System.out.println(name);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } }


    }
}
