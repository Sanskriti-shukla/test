package File_Handling;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f = new FileReader("C:\\\\Users\\\\TRPC05\\\\FC1.txt");
            try {
                int i;
                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                f.close();
                System.out.println("File closed...!");
            }
            System.out.println("Successfully read...!");
        } catch (IIOException | FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
