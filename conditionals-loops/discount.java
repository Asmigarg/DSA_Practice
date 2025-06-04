// Calculate Discount Of Product

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the actual price: ");
        int actual = scanner.nextInt();
        System.out.print("Enter the discount: ");
        int discount = scanner.nextInt();

        float discountprice = actual - ((actual / 100) * discount);
        System.out.println(discountprice);
        scanner.close();
    }
}
