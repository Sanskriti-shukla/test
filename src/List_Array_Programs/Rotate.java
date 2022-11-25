package List_Array_Programs;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scan.nextInt();
        System.out.println("Enter the rotation you want : ");
        int n = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int j, last;
            last = array[array.length - 1];
            for (j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
        System.out.println();
        System.out.println("Array after right rotation: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
