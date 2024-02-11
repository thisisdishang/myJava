/* Create the following method : public static void printUntilNumber(int number).
It should print the numbers from one to the number passed as a parameter. */

import java.util.*;

class R1 {
    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = s.nextInt();
        System.out.println("Numbers Until " + no + " are:-");
        printUntilNumber(no);
    }
}