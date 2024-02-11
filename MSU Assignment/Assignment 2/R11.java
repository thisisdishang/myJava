/* Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces and
prints the first part of the string and last part of the string. */

import java.util.*;

class R11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();

        if (str.isEmpty() == true) {
            System.out.println("String is empty...Enter the string");
        } else {
            String a[] = str.split(" ");
            for (int i = 0; i < a.length; i++) {
                if (i == 0) {
                    System.out.println(a[i]);
                }
                if (i == a.length - 1) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}