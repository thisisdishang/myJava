// Write a java program to print the exception information using printStackTrace() method.

public class Q1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception is raised");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}