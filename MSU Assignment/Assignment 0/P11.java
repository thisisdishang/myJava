// a java program to show use of short circuit logical operators

public class P11 {
 public static void main(String[] args) {
    //logical AND(&&)
    int a=3;
    if(a%2==0 && a<15){
        System.out.println(a+" is even number and less than 15");
    }
    else if(a%2==0 && a>15){
        System.out.println(a+" is even number and greater than 15");
    }
    else{
        System.out.println(a+" is not even number");
    }

    //logical OR(||)
    if(false||false||true){
        System.out.println("True portion is run...");
    }
 }   
}