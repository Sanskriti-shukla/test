package TCS_Nqt;

import java.util.Scanner;

public class CountWheel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of v");
        int V=sc.nextInt();
        System.out.println("Enter the value of W");
        int W=sc.nextInt();
        int result=((V*4)-W)/2;
        if (W>=2 && W%2==0 && V<W){
            System.out.println("Two Wheeler"+" "+(result)+"\nFour Wheeler"+" "+(V-result));
        }
        else {
            System.out.println("INVALID INPUT");
        }
    }
}
