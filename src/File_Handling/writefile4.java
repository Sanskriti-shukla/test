package File_Handling;

import java.io.*;

public class writefile4 {
    public static void main(String[] args) throws IOException {
        String line = "";
        String paragraph = "";
        System.out.println("Enter the text: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        do {
            line = bufferedReader.readLine();
            paragraph = paragraph + line + " ";
        }
        while (!line.equals("exit"));
        System.out.println("Done");
        System.out.println("Have a good day..!");
        isr.close();
        bufferedReader.close();
        System.out.println(paragraph);
        File f1 = new File("C:\\Users\\TRPC05\\filewriter2.txt");
        FileWriter fw = new FileWriter(f1);
        fw.write(paragraph);
        fw.close();
    }

}
