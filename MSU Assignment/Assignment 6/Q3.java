// write a Java program to create a new thread by implementing Runnable interface.

class NewThread implements Runnable {
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

public class Q3 {
    public static void main(String[] args) {
        NewThread a = new NewThread();
        Thread thread = new Thread(a);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}