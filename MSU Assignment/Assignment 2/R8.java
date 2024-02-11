/* Write a program that recognizes the users. The program either shows a personal message or informs of an
incorrect username or password */

import java.util.*;

class R8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String h = s.nextLine();
        System.out.println("Enter the password: ");
        String i = s.nextLine();

        if (h.equals("alex") && i.equals("sunshine") || h.equals("emma") && i.equals("haskell")) {
            System.out.println("Login successfull. Welcome " + h + "!");
        } else {
            System.out.println("Incorrect password or username. Please try again.");
        }
    }
}