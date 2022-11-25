package File_Handling;

import java.io.File;
import java.io.IOException;

public class File_Delete {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\TRPC05\\FC.txt");
        if (f.exists()) {
            f.delete();
            System.out.println("File created");
        } else {
            f.createNewFile();
            System.out.println("Already Exist...");
        }
    }
}

