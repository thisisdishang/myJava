// Write a Java program to demonstrate FileNotFoundException.

import java.io.File;
import java.io.FileNotFoundException;

public class Q7 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            if (!file.exists())
                throw new FileNotFoundException("File not found");
            System.out.println("File found");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}