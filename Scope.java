public class Scope {
    public static void main(String args[]){
        int x;
        x=10;
        if(x==10){
            int y=20;
            System.out.println("x and y is "+x+" "+y);
            x=y*2;
        }
        //y=100;
        //here y is out of scope variable because it is not define outside the curly braces
        System.out.println("X is "+x);
    }
}