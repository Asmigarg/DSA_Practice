package methods;
// Write a program to print the factorial of a number by defining a method named 'Factorial'. 

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);

        scanner.close();
    }

    public static long fact(int n) {
        long factorial = 1;
        if (n < 0) {
            System.out.println("cannot calculate");
        }
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
