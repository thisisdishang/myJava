class Example1 {
    public static void main(String[] args) {
        int a = 25, b = 0, c;
        try {
            c = a / b;
            System.out.println("C = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e+"\nYou can not divide any number by zero");
        }
        System.out.println("End");
    }
}