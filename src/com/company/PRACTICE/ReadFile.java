package com.company.PRACTICE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileReader r= new FileReader("C:\\Users\\TRPC05\\Desktop\\bubble-1.1\\Test project\\filewriter.txt");
            try{
                int i;
                while ((i=r.read())!=-1){
                    System.out.print((char)i);
                }
        }
            finally {
                r.close();
            }}
            catch (IOException e){
                System.out.println(e);
            }
        }
    }

