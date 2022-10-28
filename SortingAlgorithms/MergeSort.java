package SortingAlgorithms;

public class MergeSort {

    // Merges to sub-arrays
    private void merge(int arr[], int l, int m, int r){
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create 2 temp arrays
        int Temp1[] = new int[n1];
        int Temp2[] = new int[n2];

        // Copy the data numbers to a temporary array
        for (int i = 0; i < n1; ++i) {
            Temp1[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j){
            Temp2[j] = arr[m + 1 + j];
        }

        // We then merge the temporary arrays

        // Index values for the temporary arrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2){
            if (Temp1[i] <= Temp2[j]) {
                arr[k] = Temp1[i];
                i++;
            }
            else {
                arr[k] = Temp2[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of Temp1
        while (i < n1) {
            arr[k] = Temp1[i];
            i++;
            k++;
        }

        // Copy the remaining elments of Temp2
        while (j < n2) {
            arr[k] = Temp2[j];
            j++;
            k++;
        }
    }

    // Function that does the actual sorting
    private void sort(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // Helper function to print the array
    private static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String args[]){
        int arr[] = { 6, 2, 5, 8, 11, 15, 25, 201 };

        System.out.println("Provided array:");
        printArray(arr);

        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        printArray(arr);
    }
}
