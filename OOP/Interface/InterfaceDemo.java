interface i1 {
    void hello();
}

class c1 implements i1 {
    // public keyword is compulsory
    public void hello() {
        System.out.println("Hello Interface");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        c1 c = new c1();
        c.hello();
    }
}