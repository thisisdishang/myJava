// try with multiple catch

class Example2 {
    public static void main(String[] args) {
        int a = 25, b = 0, c;
        try {
            int arr[] = new int[5];
            arr[10] = 15;
            c = a / b;
            System.out.println("C = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e + "\nYou can not divide any number by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "\nArray index is out of range");
        } catch (Exception e) {
            System.out.println(e + "\nGeneral Error");
        } finally {
            System.out.println("Finally always executed");
        }
    }
}