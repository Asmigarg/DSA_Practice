// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int t=in.nextInt();
        int r=in.nextInt();
        float si=(p*t*r)/100;
        System.out.println(si);
    }
}
