/* Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane,
and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes. */

interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("spacecraft");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("airplane");
    }
}

class helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("helicopter");
    }
}

public class Q3 {
    public static void main(String[] args) {
        helicopter h = new helicopter();
        Airplane a = new Airplane();
        Spacecraft s = new Spacecraft();

        h.fly_obj();
        a.fly_obj();
        s.fly_obj();
    }
}