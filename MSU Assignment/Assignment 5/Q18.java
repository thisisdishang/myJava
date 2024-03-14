/* Write a Java Program to Illustrate Exception Handling with Method Overriding where SuperClass doesn't declare any exception
and SubClass declare Unchecked exception. */

class SuperClass {
    void display() {
        System.out.println("Super Class method is invoked.");
    }
}

class SubClass extends SuperClass {
    @Override
    void display() throws ArrayIndexOutOfBoundsException {
        System.out.println("Sub Class method is invoked");
        throw new ArrayIndexOutOfBoundsException("Unchecked Exception");
    }
}

public class Q18 {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        try {
            superClass.display();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}