class car {
    car(int a, int b) {
        this();
        System.out.println("Car one para cons is called");
    }

    car() {
        System.out.println("Car default cons is called");
    }
}

class bike extends car {
    bike() {
        super(10, 20);
        System.out.println("Bike cons is called");
    }
}

class SuperAndThis {
    public static void main(String[] args) {
        bike b1 = new bike();
    }
}