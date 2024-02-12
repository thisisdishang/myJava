class car1 {
    car1(int a, int b) {
        System.out.println("Car cons is called");
    }
}

class bike extends car1 {
    bike() {
        super(10, 20);
        System.out.println("Bike cons is called");
    }
}

class SuperConstructor {
    public static void main(String[] args) {
        bike b1 = new bike();
    }
}