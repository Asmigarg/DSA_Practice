// Write a function to check if a given triplet is a Pythagorean triplet or not.

public class pythogorean {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        if (isTriplet(a, b, c)) {
            System.out.println("Pythogorean Triplet");
        } else {
            System.out.println("Not pythagorean triplet");
        }
    }

    public static boolean isTriplet(int x, int y, int z) {
        int a = Math.min(x, Math.min(y, z));
        int c = Math.max(x, Math.max(y, z));
        int b = x + y + z - a - c;

        return (a * a + b * b) == (c * c);
    }
}
