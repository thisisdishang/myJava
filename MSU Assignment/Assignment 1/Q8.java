/* A java program that reads numbers from the user until the user inputs a number 0. After this the program outputs the sum of the numbers.
The number zero does not need to be added to the sum, even if it does not change the results */

import java.util.*;

class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, sum = 0;
        while (true) {
            System.out.println("Give a number:");
            num = s.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of numbers is " + sum);
    }
}
