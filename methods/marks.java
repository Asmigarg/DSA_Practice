package methods;

// Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered.

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            System.out.println("Subject" + i + "-");
            grade(marks);
        }

        scanner.close();
    }

    public static void grade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: DD");
        } else if (marks <= 40 && marks >= 0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks! Please enter a number between 0 and 100.");
        }
    }
}