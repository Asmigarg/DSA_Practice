package methods;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        float r = scanner.nextFloat(); 

        circumference(r);
        area(r);
        
        scanner.close();
    }

    // Method to calculate and print the circumference
    public static void circumference(float r) {
        double result = 2 * Math.PI * r;
        System.out.println("Circumference of the circle: " + result);
    }

    // Method to calculate and print the area
    public static void area(float r) {
        double result = Math.PI * r * r;
        System.out.println("Area of the circle: " + result);
    }
}
