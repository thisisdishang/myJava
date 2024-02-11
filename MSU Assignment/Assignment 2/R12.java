/* Write a program that reads names and ages from the user until an empty line is entered. The name and age are separated by a comma.
 After reading all user input, the program prints the age of the oldest person. You can assume that the user enters at least one person,
 and that one of the users is older than the others. */

import java.util.*;

class R12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int maxAge = Integer.MIN_VALUE;
        String oldestPerson = "";

        System.out.println("Enter names and ages (separated by comma), press Enter on an empty line to finish:");

        while (true) {
            String input = s.nextLine().trim();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());

            if (age > maxAge) {
                maxAge = age;
                oldestPerson = name;
            }
        }

        if (!oldestPerson.isEmpty()) {
            System.out.println("The oldest person is " + oldestPerson + " with age " + maxAge + ".");
        } else {
            System.out.println("No input provided.");
        }
    }
}