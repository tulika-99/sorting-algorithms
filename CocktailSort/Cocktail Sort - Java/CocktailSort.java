import java.util.Arrays;

public class CocktailSort {
    public static void sort(int[] array) {
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped) {
            swapped = false;
            for (int i = start; i < end - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;
            end--;

            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            start++;
        }
    }
}

class CocktailSortEvaluator {
    public static void main(String[] args) {
        int[] array = {9,3,6,1,4};
        CocktailSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
