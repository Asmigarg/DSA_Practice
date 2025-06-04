// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=in.nextInt();
        System.out.println("Enter num2:");
        int num2=in.nextInt();
        System.out.println("Enter operator:");
        String opp=in.next();
        if(opp.equals("+")){
            System.out.println("The sum of number is-> "+(num1+num2));
        }else if(opp.equals("-")){
            System.out.println("The sub of number is-> "+(num1-num2));
        }
    }
}
