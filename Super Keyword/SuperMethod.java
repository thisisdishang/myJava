class car {
    void speed() {
        System.out.println("Car Speed");
    }
}

class bike extends car {
    void speed() {
        System.out.println("Bike Speed");
        super.speed();
    }
}

class SuperMethod {
    public static void main(String[] args) {
        bike b1 = new bike();
        b1.speed();
    }
}
