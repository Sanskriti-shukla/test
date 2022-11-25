package TCS_Nqt;

import java.util.Scanner;

public class Slot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] e = new int[T];
        int[] l = new int[T];
        for (int i = 0; i < T; i++) {
            e[i] = sc.nextInt();
        }
        for (int i = 0; i < T; i++) {
            l[i] = sc.nextInt();
        }
        int sum = 0, max = 0;
        for (int i = 0; i < T; i++) {
            sum += e[i] - l[i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
