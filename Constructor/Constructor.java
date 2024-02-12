class mycons {
    void me() {
        // member function
    }

    mycons() {
        System.out.println("Hello i am constructor");
    }
}

class Constructor {
    public static void main(String args[]) {
        mycons m1 = new mycons();
    }
}