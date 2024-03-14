// Write a Java program to demonstrate ClassNotFoundException.

public class Q12 {
    public static void main(String[] args) {
        try {
            Class.forName("JavaAss4.MyException.Help");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}