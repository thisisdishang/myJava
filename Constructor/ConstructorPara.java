class student {
    int rno;
    String sname;

    student(int r, String name) {
        rno = r;
        sname = name;
    }

    void display() {
        System.out.println(rno + " " + sname);
    }
}

class ConstructorPara {
    public static void main(String[] args) {
        student s1 = new student(201, "Kairos");
        s1.display();
    }
}