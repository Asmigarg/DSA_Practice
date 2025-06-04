// Calculate Average Of N Numbers

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for (int i = 0; i <n; i++) {
            int num=in.nextInt();
            sum+=num;
        }
        System.out.println(sum);
        float avg =((float)sum / n);
        System.out.println(avg);
        in.close();
    }
}