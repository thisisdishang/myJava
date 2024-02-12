// If there is ambiguity between the instance variable and parameter, this keyword resolv the problem

class student2 {
    int rno;

    student2(int rno) {
        this.rno = rno;
    }

    void display() {
        System.out.println(rno);
    }
}

class InstanceVariable {
    public static void main(String[] args) {
        student2 s1 = new student2(5);
        s1.display();
    }
}