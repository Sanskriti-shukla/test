package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
        int n=5;
        String leftspace= "       ";
        String Rightspace= "       ";
        for(int i=1; i<=n; i++){
            int k = 1;
            for (int m=n-i; m>=1; m--)
                System.out.print(" ");
            for(int j=1; j<=n; j++){
                if(j>=n+1-i ){
                    System.out.print(k + leftspace);
                    k--;
                }
                else{
                    System.out.print(Rightspace);

                    k++;
                } }
            System.out.println();
        }}}
