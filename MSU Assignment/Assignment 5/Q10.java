// Write a Java program to demonstrate IOException.

import java.io.File;
import java.io.IOException;

public class Q10 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            if (file.exists()) {
                file.createNewFile();
            } else {
                throw new IOException("File does not exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}