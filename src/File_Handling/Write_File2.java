package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Write in a file using BufferedWriter.....
public class Write_File2 {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\TRPC05\\FC1.txt");
            BufferedWriter b = new BufferedWriter(f);
            try {
                b.write("I have heard the terms Java Virtual Machine and JVM. Is this Java software?\n" +
                        "The Java Virtual Machine is only one part of Java software that is involved in running an application." +
                        " The Java Virtual Machine is built right into your Java software download, " +
                        "part of the JRE and helps run Java applications.");

            } finally {
                b.close();
            }
            System.out.println("Successfully Written in a file...!");
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}
