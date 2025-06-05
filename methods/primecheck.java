package methods;
// Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("not a Prime Number");
        }

        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
