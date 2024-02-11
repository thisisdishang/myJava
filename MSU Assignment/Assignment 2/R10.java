/* Write a program that reads user input until an empty line. For each non-empty string, the program splits the string by spaces and then
prints the pieces that contain av, each on a new line.(Using contains method). */

import java.util.*;

class R10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();

        if (str.isEmpty() == true) {
            System.out.println("String is empty...Enter the string");
        } else {
            String a[] = str.split(" ");
            for (int i = 0; i < a.length; i++) {
                if (a[i].contains("av")) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}