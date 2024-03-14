/* Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending order.
Create two classes BubbleSort and SelectionSort that implement the Sortable interface and provide their own implementations of the
sort() method. */

interface sortable {
    void sort(int arr[]);

}

class BubbleSort implements sortable {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements sortable {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}

class Q7 {
    public static void main(String[] args) {
        int arr[] = { 55, 45, 10, 70 };

        sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Array sorted using BubbleSort:");
        printArray(arr);

        sortable SelectionSort = new SelectionSort();
        SelectionSort.sort(arr);
        System.out.println("\nArray sorted using SelectionSort:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}