package methods;
// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        checkevenOdd(n);

        scanner.close();
    }

    public static void checkevenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
