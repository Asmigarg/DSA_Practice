package methods;
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class largestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int largest = largest(num1, num2, num3);
        int smallest = smallest(num1, num2, num3);

        System.out.printf("largest of three numbers is : %d %n", largest);
        System.out.printf("smallest of three numbers is : %d %n", smallest);

        scanner.close();
    }

    public static int largest(int num1, int num2, int num3) {
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        return max;
    }

    public static int smallest(int num1, int num2, int num3) {
        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        return min;
    }
}