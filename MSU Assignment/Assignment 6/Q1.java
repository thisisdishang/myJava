// create a java program in which we will create a new thread , create a class NewThread with run() method.

class NewThread extends Thread {
    public void run() {
        System.out.println("Code running from thread");
    }
}

class Q1 {
    public static void main(String[] args) {
        NewThread Thread = new NewThread();
        Thread.start();
    }
}