public class Scope {
    public static void main(String args[]){
        int x;
        x=10;
        if(x==10){
            int y=-1;
            System.out.println("Y is "+y);
            y=100;
            System.out.println("Y is "+y);
            //scope of y variable is end here...
        }
        //y=110;
        //here y is out of scope variable because it is not define outside the curly braces
        System.out.println("X is "+x);
    }
}