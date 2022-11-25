package com.company.PRACTICE;

import com.sun.source.tree.CatchTree;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        try{
            FileWriter f= new FileWriter("C:\\Users\\TRPC05\\LC.text");
            try{
                f.write("Java programming is the best language....!");
            }
            finally {
                f.close();
            }
            System.out.println("Successfully wrote in a file");
        }
        catch (IOException i){
            System.out.println(i);

        }
    }
}
