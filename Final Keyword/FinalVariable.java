class FinalVariable {
    public static void main(String[] args) {
        final int a = 10;
        System.err.println("Before value a = " + a);
        // a+=5; //give error because its final variable
        System.out.println("After value a = " + a);
    }
}