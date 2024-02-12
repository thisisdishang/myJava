// Note: Call to this() must be the first statement in constructor

class student {
    student() {
        this(10, 20);
        System.out.println("Default para");
    }

    student(int a) {
        this();
        System.out.println("One Para");
    }

    student(int a, int b) {
        System.out.println("Two Para");
    }
}

class CurrentConstructor {
    public static void main(String[] args) {
        student s1 = new student(15);
    }
}