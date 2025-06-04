// Take integer inputs till the user enters 0 and print the largest number from all

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int largest = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("largest:" + largest);
        scanner.close();
    }
}
