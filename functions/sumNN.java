// Write a function that returns the sum of first n natural numbers.

public class sumNN {
    public static void main(String[] args) {
        int n = 10;
        int sum = SUM(n);
        System.out.println("SUM IS: " + sum);
    }

    public static int SUM(int n) {
        return n * (n + 1) / 2;
    }
}