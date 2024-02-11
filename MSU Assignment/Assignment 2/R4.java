/* Define a method called greatest that takes three numbers and returns the greatest of them. If there are multiple greatest values,
returning one of them is enough. Printing will take place in the main program. */

import java.util.*;

class R4 {
    public static int greatest(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("Greatest number is " + greatest(a, b, c));
    }
}