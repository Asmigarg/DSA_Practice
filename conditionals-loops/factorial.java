// Factorial Program In Java

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int fact = 1;
        if (n == 0) {
            System.out.println(0);
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
        scanner.close();
    }
}
