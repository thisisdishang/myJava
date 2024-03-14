// Write a Java program to demonstrate working of chained exceptions.

public class Q17 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            throw new Exception("divide by zero");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}