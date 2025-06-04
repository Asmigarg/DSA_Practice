// Find if a number is palindrome or not

public class palindrome {
    public static void main(String[] args) {
        int n = 3223;
        int temp = n;
        int reverse = 0;
        while (temp > 0) {
            int lastdigit = temp % 10;
            reverse = reverse * 10 + lastdigit;
            temp /= 10;
        }
        System.out.println(reverse == n);
    }
}
