/* Create two files, names.txt and other-names.txt. Write a program that first asks the user for the name of the file to be read,
after which the user is prompted for the string that they're looking for. The program then reads the file and searches for the desired
string. If the string is found, the program should print "Found!". If not, the program should print "Not found.". If reading the file
fails (the reading ends in an error) the program should print the message "Reading the file " + file + " failed.". */

import java.io.*;
import java.util.Scanner;

class Q5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the name of the file to be read: ");
    String fileName = scanner.nextLine();

    System.out.print("Enter the string to search for: ");
    String searchString = scanner.nextLine();

    if (searchFile(fileName, searchString)) {
      System.out.println("Found!");
    } else {
      System.out.println("Not found.");
    }

    scanner.close();
  }

  // Method to search for a string in a file
  private static boolean searchFile(String fileName, String searchString) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line;

      // Read and search each line of the file
      while ((line = br.readLine()) != null) {
        if (line.contains(searchString)) {
          return true; // String found
        }
      }
    } catch (IOException e) {
      System.err.println("Reading the file " + fileName + " failed.");
    }
    return false; // String not found or an error occurred during file reading
  }
}
