// Sum Of N Numbers

import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of numbers: ");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.println("Enter numbers:");
        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Sum:" + sum);
        scanner.close();
    }
}