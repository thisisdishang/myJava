// a java program to get absolute value using a ternary operator

public class P12 {
    public static void main(String[] args) {
        int n = -7;
        n = (n < 0) ? -n : n;
        System.out.println("Absolute value is: " + n);
    }
}