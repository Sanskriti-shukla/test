package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n=4,count=1;
        for (int i=1; i<=n; i++){
            for (int k=n-i ; k>=1; k--){
                System.out.print("      ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("          "+count++ );
            }
            System.out.println( );
        } }
}
