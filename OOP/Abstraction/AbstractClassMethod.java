// abstract class and can not instantiated

abstract class rbibank {
    // abstract method and does not have body part
    abstract void interest();
}

class sbi extends rbibank {
    void interest() {
        System.out.println("SBI interest is 8%");
    }
}

class bob extends rbibank {
    void interest() {
        System.out.println("BOB interest is 10%");
    }
}

class AbstractClassMethod {
    public static void main(String[] args) {
        rbibank r1 = new sbi();
        r1.interest();
        rbibank r2 = new bob();
        r2.interest();
    }
}