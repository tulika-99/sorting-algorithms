public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            // find the index of the smallest value
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                // if values after i are smaller, replace min_index
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // swap the smallest value with number at i
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}