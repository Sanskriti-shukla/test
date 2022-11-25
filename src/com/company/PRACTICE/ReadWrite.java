package com.company.PRACTICE;

import java.io.File;
import java.util.Scanner;

public class ReadWrite {


        public static void main(String[] args) {

            try {
                // create a new file object
                File file = new File("C:\\Users\\TRPC05\\Desktop\\bubble-1.1\\Test project\\Ascending.txt");

                // create an object of Scanner
                // associated with the file
                Scanner sc = new Scanner(file);

                // read each line from file and print it
                System.out.println("Reading File Using Scanner:");
                while(sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }

                // close scanner
                sc.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }


