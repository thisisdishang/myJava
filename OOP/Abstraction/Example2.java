abstract class bike {
    abstract void run(); // abstract method

    // constructor
    bike() {
        System.out.println("Bike start");
    }

    // Non abstract method
    void gearchange() {
        System.out.println("Gear change");
    }
}

class Example2 extends bike {
    // mandatory to define
    void run(){
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        bike b1=new Example2();
        b1.gearchange();
        b1.run();
    }
}