package TCS_Nqt;

import java.util.Arrays;
import java.util.Scanner;
public class Slot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array..");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of arr");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int count = 1;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}

