package List_Array_Programs;

import java.util.Scanner;

public class sorted1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scan.nextInt();
        System.out.println("Enter the rotation you want : ");
        int rotation = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < rotation; i++) {
            rotateArray(array);
        }
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }
    public static void rotateArray(int[] arr) {
        int j,lastElement;
        lastElement= arr[arr.length - 1];
        for ( j = 0; j <arr.length-1; j++) {
            arr[j] = arr[j -1];
        }
    }
}