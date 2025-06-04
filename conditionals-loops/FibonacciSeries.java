// Fibonacci Series In Java Programs

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive Integer.");
        } else {
            int first = 0;
            int second = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
        scanner.close();
    }
}