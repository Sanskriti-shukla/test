package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

//Write in a file using FileWriter...!
public class Write_File {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\TRPC05\\FC.txt");

            try {

                f.write("What is Java Plug-in software?\n" +
                        "The Java Plug-in software is a component of the Java Runtime Environment (JRE). " +
                        "The JRE allows some applications written in the Java programming language to launch via some browsers." +
                        " The Java Plug-in software is not a standalone program and cannot be installed separately.");
            } finally {
                f.close();
            }
            System.out.println("Paragraph is written successfully...!");
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}
