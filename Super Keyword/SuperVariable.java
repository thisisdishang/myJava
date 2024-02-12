class car {
    int speed = 100;
}

class bike extends car {
    int speed = 50;

    void speedPrint() {
        System.out.println("Car speed " + super.speed);
        System.out.println("Bike speed " + speed);
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        bike b1 = new bike();
        b1.speedPrint();
    }
}
