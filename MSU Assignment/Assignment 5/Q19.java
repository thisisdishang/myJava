/* Java Program to Illustrate Exception Handling with Method Overriding Where SuperClass declares an exception and SubClass declares
exceptions other than the child exception of the SuperClass declared Exception. */

class SuperClass {
    void display() throws Exception {
        System.out.println("SuperClass display method is invoked");
    }
}

class SubClass extends SuperClass {
    @Override
    void display() throws NullPointerException {
        System.out.println("SubClass display method is invoked");
        throw new NullPointerException("SubClass Exception");
    }
}

public class Q19 {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        try {
            superClass.display();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}