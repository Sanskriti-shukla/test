package File_Handling;

import java.io.File;
import java.io.IOException;
//import com.company.PRACTICE.File;

public class create_File2 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\TRPC05\\FC.txt");

        if (f.createNewFile()) {

            System.out.println("File created");
        } else {
            System.out.println("Already Exist...");
        }
    }
}
