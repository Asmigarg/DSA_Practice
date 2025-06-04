// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enetr the number: ");
        int n = scanner.nextInt();

        System.out.println("Factors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
            
        }
        scanner.close();
    }
}