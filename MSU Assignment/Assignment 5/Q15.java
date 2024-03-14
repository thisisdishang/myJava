// Write a Java program that demonstrates the use of throw.

public class Q15 {
    public static void main(String[] args) {
        try {
            throw new Exception("Raising Exceptions are not allowed. Please report this issue.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}