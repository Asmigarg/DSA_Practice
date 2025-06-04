
// HCF Of Two Numbers Program
import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("the HCF of two numbers are->");
        int min = Math.min(num1, num2);
        int hcf = 0;
        for (int i = min; i > 0; i--) {
            if (num1 % i == 0 && num2 % 2 == 0) {
                hcf = i;
                break;
            }
        }
        System.out.println(hcf);
        scanner.close();
    }
}
