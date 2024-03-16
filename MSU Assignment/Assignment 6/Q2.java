// create a Java program in which we will check when a new thread creates on the basis of the active number of threads.

class NewThread extends Thread {
    public void run() {
        System.out.println("Code running from thread");
    }
}

class Q2 {
    public static void main(String[] args) {
        NewThread th1 = new NewThread();
        th1.start();
        int activeThread = NewThread.activeCount();
        System.out.println("Number of active threads: " + activeThread);
    }
}
