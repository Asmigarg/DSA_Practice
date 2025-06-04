// To find Armstrong Number between two given number.

public class Armstrong {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            int length = findLength(i);
            if (isArmstrong(i, length)) {
                System.out.println(i);
            }
        }
    }

    public static int findLength(int n) {
        int length = 0;
        while (n > 0) {
            n = n / 10;
            length++;
        }
        return length;
    }

    public static boolean isArmstrong(int n, int length) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, length);
            temp = temp / 10;
        }
        return sum == n;
    }
}
