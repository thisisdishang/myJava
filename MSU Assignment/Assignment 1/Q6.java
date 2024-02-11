/* A java program that reads values from the user until they input a 0. After this, the program prints the total number of inputted values.
The zero that's used to exit the loop should not be included in the total number count */

import java.util.*;

class Q6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0, n;
		while (true) {
			System.out.println("Give a number : ");
			n = s.nextInt();
			if (n == 0) {
				break;
			}
			count++;
		}
		System.out.println("Total number of numbers: " + count);
	}
}