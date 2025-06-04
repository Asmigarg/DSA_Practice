// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class nameInput {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=in.nextLine();
        System.out.println("Hello welcome to codeing world "+name);
    }
}
