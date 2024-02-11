// a java program that creates an array of the number of days in each month for example for the month of february it will show 28 days

public class P5 {
    static void monthday(int no) {
        int[] a = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] b = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December" };
        System.out.println("Total Day in " + a[no - 1] + " " + b[no - 1]);
    }

    public static void main(String[] args) {
        monthday(2);
    }
}