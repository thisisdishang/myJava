/* Write a program that reads strings from the user. If the input is empty, the program stops reading input and halts. For each non-empty
input it splits the string input by whitespaces and prints each part of the string on a new line. */

import java.util.*;

class R9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();

        if (str.isEmpty() == true) {
            System.out.println("String is empty...Enter the string");
        } else {
            String a[] = str.split(" ");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
