package methods;
// A person is eligible to vote if his/her age is greater than or equal to 18.

// Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int n = scanner.nextInt();

        checkAge(n);
        scanner.close();
    }

    public static void checkAge(int n) {
        if (n >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("not eligible");
        }
    }
}