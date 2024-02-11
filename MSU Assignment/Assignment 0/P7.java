// a java program to show local variable type inference, use variable name avg and using var initialized the value with boolean, int and float, 
// use var as a user defined variable name as well as type of declaration.
public class P7 {
    public static void main(String[] args) {
        var avg = 30.5;
        System.out.println(avg);// float type
        var avg2 = 30;
        System.out.println(avg2);// integer type
        var avg3 = true;
        System.out.println(avg3);// boolean type
    }
}
