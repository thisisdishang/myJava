/* Write a program that asks the user for a string. If the user writes the string "true", the program prints "You got it right!",
otherwise it prints "Try again!" */

import java.util.*;

class R7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=s.nextLine();


        if(str.equals("true"))
        {
            System.out.println("You got it right!");
        }
        else
        {
            System.out.println("Try again!");
        }
    }    
}