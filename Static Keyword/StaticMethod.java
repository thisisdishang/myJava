class student {
    int rno;
    static String clg = "SDJIC";

    static void change() {
        // rno=10; //It will give you error
        // static method can access only static data
        clg = "SDJ";
        System.out.println(clg);
    }
}

class StaticMethod {
    public static void main(String[] args) {
        // static method belongs to the class rather than object
        // static method can be call by directly with class name
        student.change();
    }
}