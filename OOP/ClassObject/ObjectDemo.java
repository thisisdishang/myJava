package OOP.ClassObject;

class ObjectDemo {
    public static void main(String args[]) {
        System.out.println("Welcome User");
        mca m1 = new mca();
        m1.msg();
        m1.print();
    }
}

class mca {
    void print() {
        System.out.println("MCA-1");
    }

    void msg() {
        System.out.println("Hello");
    }
}