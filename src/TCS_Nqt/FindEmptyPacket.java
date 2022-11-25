package TCS_Nqt;

import java.util.Scanner;

public class FindEmptyPacket {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want..");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Enter all number");
            arr[i]=sc.nextInt();
        } int lastdigit=0;
        int e = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (e == 0) {
                arr[0] = arr[i];
            }
        }

    }
}
