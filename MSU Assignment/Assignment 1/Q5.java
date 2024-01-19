/* A java program that asks the user for numbers. If the number is negative (smaller than zero), the program prints for user "Unsuitable number" and asks the user for a new number.
If the number is zero, the program exits the loop. If the number is positive, the program prints the number to the power of two */

import java.util.*;

class Q5 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n;
		while(true)
		{
			System.out.println("Enter the number : ");
			n=s.nextInt();
			if(n<0)
			{
				System.out.println("Unsuitable number");
				continue;
			}
			else if(n==0)
			{
				break;
			}
			else
			{
				System.out.println("2 Power of number "+n+" is "+ Math.pow(n,2));
				break;
			}			
		}
	}
}