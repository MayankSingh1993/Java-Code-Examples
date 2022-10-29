package SortingAlgorithms;

public class InsertionSort {

    // Function to sort the array using insertion sort
    private void sort(int arr[]){
        int len = arr.length;

        for (int i = 1; i < len; ++i) {
            int key = arr[i];
            int j = i - 1;
            // Move elemnts from 0 ... i-1 that are greater
            // than their key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Helper function to print the array
    private static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[]){
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort is = new InsertionSort();
        is.sort(arr);

        printArray(arr);
    }
}
