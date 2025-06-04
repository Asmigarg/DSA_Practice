// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        while (true) {
            System.out.println("Enter numbers:");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum:" + sum);
        scanner.close();
    }
}
