// Write a program that performs multiple tasks with a single thread.

public class Q4 {
    public static void main(String[] args) {
        // Task 1: Print a message
        System.out.println("Task 1: Printing a message");

        // Task 2: Perform some computation
        int result = performComputation(5, 10);
        System.out.println("Task 2: Result of computation: " + result);

        // Task 3: Call a method
        displayMessage("Task 3: Calling a method");

        // Task 4: Looping
        System.out.println("Task 4: Looping from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Task 5: Print another message
        System.out.println("Task 5: Printing another message");
    }

    // Method for Task 2: Perform some computation
    public static int performComputation(int a, int b) {
        return a + b;
    }

    // Method for Task 3: Call a method
    public static void displayMessage(String message) {
        System.out.println(message);
    }
}
