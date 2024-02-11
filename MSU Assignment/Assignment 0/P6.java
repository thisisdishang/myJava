// a java program to find the average of numbers stored in an array

public class P6 {
    public static void main(String[] args) {
        int[] a = { 45, 98, 62, 32, 12, 7 };
        int count = a.length, total = 0;

        System.out.printf("Array is : [");
        for (int i = 0; i < count; i++) {
            System.out.printf("\"" + a[i] + "\"" + ",");
            total += a[i];
        }
        System.out.printf("]");

        float avg = total / count;
        System.out.printf("\nAverage of number in an array: %.2f", avg);
    }
}