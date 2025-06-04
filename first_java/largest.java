// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class que5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        if(num1>num2){
            System.out.println("Num1 is greater");
        }else{
            System.out.println("Number 2 is greater");
        }

    }
}
