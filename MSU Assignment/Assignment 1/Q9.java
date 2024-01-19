// A java program which calculates the factorial of a number given by the user

import java.util.*;

class Q9 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        int fact=1;
        int temp=num;
        if(temp<0)
        {
            System.out.println("Factorial of negative is not possible");
        }
        else
        {
            while (temp>0) {
                fact*=temp;
                temp-=1;
            }
            System.out.println("Factorial of "+num+" is "+fact);
        }       
    }
}
