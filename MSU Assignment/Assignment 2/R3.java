/* Write a method public static void divisibleByThreeInRange(int beginning, int end) that prints all the numbers divisible by three
in the given range. The numbers are to be printed in order from the smallest to the greatest. */

import java.util.*;

class R3 {
    public static void divisibleByThreeInRange(int beginning, int end) {
        if (beginning < end) {
            for (int i = beginning; i <= end; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = beginning; i >= end; i--) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the beginning number:");
        int beg = s.nextInt();
        System.out.println("Enter the end number:");
        int end = s.nextInt();
        System.out.println("Divisible by three numbers are:-");
        divisibleByThreeInRange(beg, end);
    }
}