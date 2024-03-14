/* Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers in descending
order. Create two classes QuickSort and MergeSort that implement the Sortable interface and provide their own implementations of the
sort() method. */

// Sortable interface
interface Sortable {
    void sort(int[] array);
}

// QuickSort class implementing Sortable
class QuickSort implements Sortable {
    @Override
    public void sort(int[] array) {
        // Implement QuickSort algorithm for descending order
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}

// MergeSort class implementing Sortable
class MergeSort implements Sortable {
    @Override
    public void sort(int[] array) {
        // Implement MergeSort algorithm for descending order
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private void merge(int[] array, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, low, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (leftArray[i] >= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }
}

// Main class to test the Sortable interface and sorting algorithms
class Q11 {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        // Using QuickSort to sort the array in descending order
        Sortable quickSort = new QuickSort();
        quickSort.sort(array);
        System.out.println("Array sorted using QuickSort in descending order:");
        printArray(array);

        // Using MergeSort to sort the array in descending order
        Sortable mergeSort = new MergeSort();
        mergeSort.sort(array);
        System.out.println("\nArray sorted using MergeSort in descending order:");
        printArray(array);
    }

    // Helper method to print the array
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}