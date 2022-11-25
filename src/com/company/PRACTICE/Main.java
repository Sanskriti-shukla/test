package com.company.PRACTICE;

public class Main
{
    public static void main(String args[]) //driver function
    {
        int i, j=5, k, x;
        for (i=1;i<=5;i++) {
            for (k=1;k<=j;k++) {
                System.out.print(" ");
            }
            for (x=1;x<=i;x++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.print("\n");
            j=j-1;
        }

        int m, n=4, l, o;
        for (m=4;m>=1;m--) {
            for (l=3;l<=n;l++) {
                System.out.print(" ");
            }
            for (o=1;o<=m;o++) {
                System.out.print(m);
                System.out.print(" ");
            }
            System.out.print("\n");
            n=n+1;
        }
    }
}

