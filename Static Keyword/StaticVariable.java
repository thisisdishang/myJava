class StaticVariable {
    int rno;
    String sname;
    static String clgname="SDJIC"; //static variable and use for memory management, loaded only once

    StaticVariable(int r,String name){
        rno=r;
        sname=name;
    }

    void display(){
        System.out.println(rno+" "+sname+" "+clgname);
    }

    public static void main(String[] args) {
        StaticVariable s1=new StaticVariable(101, "Dalvin");
        s1.display();
        StaticVariable s2=new StaticVariable(102, "Karl");
        s2.display();
    }
}