package Patterns;

public class Pattern2 {
    public static void main(String[] args) {


    int i,j,k;
    String LeftUpperSpace = "            ";
    String LeftLowerSpace = "            ";
    String RightUpperSpace = "                       ";
    String RightLowerSpace = "                       ";
    for (i=1;i<=5;i++){
        for (j=5;j>=i;j--){
            System.out.print(LeftUpperSpace);
        }
        for (k=1;k<=i;k++){
            System.out.print(i+RightUpperSpace);
        }
        System.out.println();
    }
    for (i=4;i>=1;i--){
        for (j=4;j>=i-1;j--){
            System.out.print(LeftLowerSpace);
        }
        for (k=1;k<=i;k++){
            System.out.print(i+RightLowerSpace);
        }
        System.out.println();
    }}
}

