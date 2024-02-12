// Here sleep() is final method and can not override in another class, it give compile time error

class routine {
    void eat() {
    }

    void drink() {
    }

    final void sleep() {
        System.out.println("Sleeping");
    }
}

class FinalMethod extends routine {
    void sleep();
}