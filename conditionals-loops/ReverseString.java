// Reverse A String In Java

public class ReverseString {
    public static void main(String[] args) {
        String s = "asmi";
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse += s.charAt(s.length() - i - 1);
        }
        System.out.println(reverse);
    }
}
