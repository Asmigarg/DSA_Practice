// Addition Of Two Numbers

import java.util.Scanner;

public class add2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first: ");
        int first = scanner.nextInt();
        System.out.println("Enter second: ");
        int second = scanner.nextInt();

        int sum = first + second;
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
