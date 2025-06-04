// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        int start=0;
        int end=1;
        if(num==1){
            System.out.println(0);
        }else{
            System.out.println(start);
            System.out.println(end);
            for (int i = 2; i <num; i++) {
                int temp=end;
                end=start+end;
                start=temp;
                System.out.println(end);
            }
        }
    }
}
