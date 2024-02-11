
/* The exercise template already contains a program, that creates an array and prints the values of the array twice. Modify the program to do following: After the first printing, the program should ask for two indices from the user.
The values in these two indices should be swapped, and in the end the values of the array should be printed once again */
import java.util.*;

class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = { 1, 3, 5, 7, 9 };
        System.out.println("Before swapping Array:-");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nGive two indices to swap: ");
        int x = s.nextInt();
        int y = s.nextInt();

        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;

        System.out.println("After swapping Array:-");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}