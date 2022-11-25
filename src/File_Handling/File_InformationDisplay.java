package File_Handling;

import java.io.File;
//import com.company.PRACTICE.File;

public class File_InformationDisplay {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\TRPC05\\FC1.txt");
        if (f.exists()) {
            System.out.println("Name of the File" + f.getName());
            System.out.println("Location of the file" + f.getAbsolutePath());
            System.out.println("Can Write Something File" + " " + f.canWrite());
            System.out.println("Can read File" + " " + f.canRead());
            System.out.println("Can execute" + " " + f.canExecute());
            System.out.println("File size" + " " + f.length());
//            System.out.println("File removed"+" "+f.delete());
        } else {
            System.out.println("File not found...!");
        }
    }
}
