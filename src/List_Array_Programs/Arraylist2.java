package List_Array_Programs;

import java.util.Scanner;

public class Arraylist2 {
    public static void main(String[] args) {
        int Size, i;
        int Count = 0;
        int Count1 = 0;
        int Count2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        Size = sc.nextInt();
        int[] a = new int[Size];
        System.out.println("please Enter" + Size + " of array");
        for (i = 0; i < Size; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < Size; i++) {
            if (a[i] < 0)
                Count++;
            else if (a[i] > 0)
                Count1++;
            else
                Count2++;
        }
        System.out.println("\nTotal  Negative Number: " + Count);
        System.out.println("Total Positive Number: " + Count1);
        System.out.println("Total Zero: " + Count2);
    }
}

