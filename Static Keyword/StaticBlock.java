class StaticBlock {
    public static void main(String[] args) {
        System.out.println("It is main method");
    }

    // static block executed before main method and use for initialize static data member
    static{
        System.out.println("It is static block");
    }
}