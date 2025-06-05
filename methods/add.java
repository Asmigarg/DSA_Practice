package methods;
// Write a program to print the sum of two numbers entered by user by defining

// your own method.

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        sum(a, b);
        scanner.close();
    }

    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum is: " + result);
    }
}