package com.company.PRACTICE;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("C:\\Users\\TRPC05\\Desktop\\bubble-1.1\\Test project\\filewriter.txt");
            try{

                f.write("Java is high level programming language." +'\n' +"it is an open source programming language" +'\n'+
                        "it is a platform independent programming language");
            }
            finally {
                f.close();
            }
            System.out.println("successfully written in file ");
        }
        catch (IOException i){
            System.out.println(i);
        }

    }
}
