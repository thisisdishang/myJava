/* Write a program that prints the contents of a file called "data.txt", such that each line of the file is printed on its own line. */

import java.io.*;

class Q4 {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
