/* A java program that reads two integers from the user and prints the square root of the sum of these integers.
The program does not need to work with negative values. You can calculate the square root of an integer with the command Math.sqrt */

import java.util.*;

class Q2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  the numer 1: ");
		int n1=s.nextInt();
		System.out.println("Enter  the numer 2: ");
		int n2=s.nextInt();
		if(n1>0 && n2>0)
		{
			int total=n1+n2;
			System.out.println("Square root of "+total+" number is "+Math.sqrt(total));	
		}
		else
		{
			System.out.print("You enter negative integer in number 1");	
		}
	}
}