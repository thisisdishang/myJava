/* Create the following method in the exercise template: public static void printFromNumberToOne(int number).
It should print the numbers from the number passed as a parameter down to one. */

import java.util.*;

class R2 {
    public static void printFromNumberToOne(int number) {
        for (int i = number; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = s.nextInt();
        System.out.println("Numbers From " + no + " to 1 are:-");
        printFromNumberToOne(no);
    }
}