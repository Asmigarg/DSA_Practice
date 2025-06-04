// Armstrong Number in java

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int original = n;
        int result = 0;
        int a = 0;

        int temp = n;
        while (temp != 0) {
            temp /= 10;
            a++;
        }

        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, a);
            temp /= 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        scanner.close();
    }
}
