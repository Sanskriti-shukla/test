package com.company.PRACTICE;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writefile3 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter their name...");
        String s = sc.next();
        String s1="N";
        do {
            FileWriter f = new FileWriter("C:\\Users\\TRPC05\\filewriter1.txt");
            f.write(s  );

            s1 = sc.next();
//            System.out.println("successfully wrote in a file");
        }
        while (!s1.equalsIgnoreCase("Exit"));
        System.out.println("successfully wrote in a file");
        System.out.println("Have a good day....");


    }

}
