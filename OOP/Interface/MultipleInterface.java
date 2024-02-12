interface i1 {
    void run();
}

interface i2 {
    void start();
}

class MultipleInterface implements i1, i2 {
    public void run() {
        System.out.println("run method is calling");
    }

    public static void main(String[] args) {
        MultipleInterface i = new MultipleInterface();
        i.run();
    }
}