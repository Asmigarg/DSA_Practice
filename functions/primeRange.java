// Write a function that returns all prime numbers between two given numbers.

public class primeRange {
    public static void main(String[] args) {
        int a = 1;
        int b = 20;

        System.out.println("Prime Numbers are:");
        printPrime(a, b);
    }

    public static void printPrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}