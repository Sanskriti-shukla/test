package Interface_Programs;

import java.util.Scanner;

interface AdvancedArithmetic {
    void divisor_sum(int n);
}

public class MyCalculator implements AdvancedArithmetic {
    int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        AdvancedArithmetic advancedArithmetic = new MyCalculator();
        advancedArithmetic.divisor_sum(n);
    }

    @Override
    public void divisor_sum(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                System.out.println(" " + i);
            }
        }
        System.out.println("sum of divisor" + " " + n + " " + "=" + sum);
    }
}
