package TCS_Nqt;

import java.util.Scanner;

public class Slot1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid String");
        String s = sc.next();
        int count1 = 0, count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                count1++;
            } else if (s.charAt(i) == '#') {
                count2++;
            }
        }
        System.out.println(count1 - count2);
    }
}
