/* The class has a method public static int sumOfNumbersInArray(int[] array). Complete the method so
 that it computes and returns the sum of the numbers in the array it receives as parameter */

class R6 {
    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = { 10, 45, 69, 3, 2, 20 };
        System.out.println("Array:-");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nSum of array is " + sumOfNumbersInArray(a));
    }
}
