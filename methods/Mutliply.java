package methods;

// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Mutliply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        mul(a, b);
        scanner.close();
    }

    public static void mul(int a, int b) {
        int result = a * b;
        System.out.println("Result is: " + result);
    }
}