// a java program to add,subtract, multiply and divide two numbers using int,float and double data types

public class P2 {
    static double add(double n1, double n2) {
        return n1 + n2;
    }

    static double sub(double n1, double n2) {
        return n1 - n2;
    }

    static double mul(double n1, double n2) {
        return n1 * n2;
    }

    static double div(double n1, double n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        System.out.println("Using Integer:-");
        System.out.println("Addition is " + (int) add(10, 15));
        System.out.println("Subtract is " + (int) sub(15, 5));
        System.out.println("Multiplication is " + (int) mul(10, 15));
        System.out.println("Division is " + (int) div(15, 5));

        System.out.println("\nUsing Float:-");
        System.out.println("Addition is " + (float) add(10, 15));
        System.out.println("Subtract is " + (float) sub(15, 5));
        System.out.println("Multiplication is " + (float) mul(10, 15));
        System.out.println("Division is " + (float) div(15, 5));

        System.out.println("\nUsing Double:-");
        System.out.println("Addition is " + add(10, 15));
        System.out.println("Subtract is " + sub(15, 5));
        System.out.println("Multiplication is " + mul(10, 15));
        System.out.println("Division is " + div(15, 5));
    }
}