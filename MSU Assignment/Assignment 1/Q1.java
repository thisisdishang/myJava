// A java program that reads an integer from the user and prints the square of the given integer, i.e. the integer multiplied by itself

import java.util.*;

class Q1 {
	static void mysqr(int num) {
		num *= num;
		System.out.println("Square is: " + num);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		mysqr(n);
	}
}