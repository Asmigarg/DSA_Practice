// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) 
// entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class sumCatoegories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Negatives = 0;
        int evenPositives = 0;
        int oddPositives = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 == 0 && num > 0) {
                evenPositives += num;
            } else if (num < 0) {
                Negatives += num;
            } else {
                oddPositives += num;
            }
        }
        System.out.println("sumofnegative->" + Negatives);
        System.out.println("Sumofeventpostive->" + evenPositives);
        System.out.println("Sumofodd postive->" + oddPositives);
        scanner.close();
    }
}
