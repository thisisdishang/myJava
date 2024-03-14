// Write a Java program to demonstrate NoSuchElementException.

import java.util.NoSuchElementException;

public class Q11 {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3, 4, 5 };
            int element = 6;
            if (contains(arr, element))
                System.out.println("Element found");
            else
                throw new NoSuchElementException();
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException");
        }
    }

    // method to check if an array contains the element
    public static boolean contains(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == element)
                return true;
        return false;
    }
}