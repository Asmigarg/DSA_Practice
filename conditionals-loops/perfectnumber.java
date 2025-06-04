// Perfect Number In Java

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not perfect number");
        }
        scanner.close();
    }
}
