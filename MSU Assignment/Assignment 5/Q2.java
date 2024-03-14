// Write a java program to print the exception information using toString() method

public class Q2 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}