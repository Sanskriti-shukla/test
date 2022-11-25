package com.company.PRACTICE;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileWrite {
    public static void main(String[] args) throws IOException {
        String line=" ";
        String paragraph=" ";
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        do{
           line=br.readLine();
           paragraph=paragraph+line;
        }while (!line.equals("exit"));
        System.out.println("done");
        System.out.println("exit");
        isr.close();
        br.close();
        System.out.println(paragraph);
  File f1 = new File("C:\\Users\\TRPC05\\filewriter3.txt");
        FileWriter fw = new FileWriter(f1);
        fw.write(paragraph);
        fw.close();
        }
    }

