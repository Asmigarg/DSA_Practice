// LCM Of Two Numbers
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("The LCM of two numbers are->");
        int max = Math.max(num1, num2);
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                break;
            }
            max++;
        }
        System.out.println(max);
        scanner.close();
    }
}