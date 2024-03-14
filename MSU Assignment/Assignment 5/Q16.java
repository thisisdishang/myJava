// Write a Java program to illustrate throws.

public class Q16 {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Error");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}