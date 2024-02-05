/* It asks the user for a number to search in the array. If the array contains the given number, the program tells the index containing
the number. If the array doesn't contain the given number, the program will advise that the number wasn't found.
(Use ArrayIndexOutOfBoundsException) */

import java.util.*;

import javax.security.sasl.SaslException;

class R5 {
    public static int my(int[] arry,int search)
    {
        for(int i=0;i<arry.length;i++)
        {
            if(arry[i]==search)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int[] a={50,18,3,20,45,8};
        int s;

        System.out.print("Array:-\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");

        System.out.println("Enter the element to search:");
        s=q.nextInt();

        try {
            int x=a[my(a, s)];
            System.out.println("Element "+s+" is found at index "+my(a, s));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds");
        }
    }
}