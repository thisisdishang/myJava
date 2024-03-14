// Write a java program to print the exception information using getMessage() method

public class Q3 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}