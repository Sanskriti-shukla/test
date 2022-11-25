import java.util.Scanner;

public class OddPosition {
    public static void main(String[] args) {
        System.out.println("Enter string to check:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String odd = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1) {
                odd += str.charAt(i);
            }
        }
        System.out.println(odd);
    }
}