package File_Handling;

import java.io.File;
import java.io.IOException;

class Create_file {
    public static void main(String[] args) {
        try {
            File obj = new File("C:\\Users\\TRPC05\\FC.txt");
            if (obj.createNewFile()) {
                System.out.println("Successfully Created File");
            } else {
                System.out.println("Already exist");
            }
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}
//we can handle the exception by two ways one is by using try catch and second is by passing exception..
//public static void main(String[], args) throw IOException{