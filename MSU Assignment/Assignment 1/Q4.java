/* A java program that reads two integers from the user. If the first number is greater than the second, the program prints "(first) is greater than (second)."
If the first number is less than the second, the program prints "(first) is smaller than (second)." Otherwise, the program prints "(first) is equal to (second)." 
The (first) and (second) should always be replaced with the actual numbers that were provided by the user */

import java.util.*;

class Q4 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int n1=s.nextInt();
		System.out.println("Enter the number 2: ");
		int n2=s.nextInt();
		if(n1>n2)
		{
			System.out.println(n1+" is greater than "+n2);
		}
		else if(n1<n2)
		{
			System.out.println(n1+" is less than "+n2);
		}
		else
		{
			System.out.println(n1+" is equal to "+n2);	
		}			
	}
}