// Write a function to find if a number is a palindrome or not. Take number as parameter.

public class palindome {
    public static void main(String[] args) {
        int n = 123321;
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return original == reverse;

    }
}
