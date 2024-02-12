package OOP.Inheritance;

class car {
    int carspeed = 100;
}

class bike extends car {
    int bikespeed = 50;

    void speeddisplay() {
        System.out.println("Car speed " + carspeed);
        System.out.println("Bike speed " + bikespeed);
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        bike b1 = new bike();
        b1.speeddisplay();
    }
}