/* A java program that reads an integer from the user. If the number is less than 0, the program prints the given integer multiplied by -1.
In all other cases, the program prints the number itself */

import java.util.*;

class Q3 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		if(n<0)
		{
			System.out.println("Number is multiply by -1: "+ (n*(-1)));
		}
		else
		{
			System.out.println("Number is as it is: "+n);  
		}			
	}
}