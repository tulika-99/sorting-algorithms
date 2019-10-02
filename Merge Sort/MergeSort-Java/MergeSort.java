/* Merge Sort in Java */
class MergeSort {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int left, int mid, int right) {
        // calc sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Initialize temp arrays */
        int Left[] = new int[n1];
        int Right[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            Left[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of left arr */
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of right arr */
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    // merge() to sort arr[1..r]
    void sort(int arr[], int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    /* Helper function to print arr */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = { 90, 30, 5, 3, 15, 1, 2 };

        MergeSort mergedArr = new MergeSort();
        mergedArr.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted:");
        printArray(arr);
    }
}