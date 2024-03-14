/* Write a Java program to demonstrate control flow of try-catch-finally clause when exception occur in try block but not handled
in catch block. */

public class Q14 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            System.out.println("Number: " + num);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}