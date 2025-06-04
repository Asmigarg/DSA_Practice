// Input currency in rupees and output in USD.

import java.util.Scanner;

public class que6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the currency in Ruppess:");
        float currency=in.nextFloat();      
        System.out.println("The currency in dollars will be:"+(currency/86)+"$");
    }
}
