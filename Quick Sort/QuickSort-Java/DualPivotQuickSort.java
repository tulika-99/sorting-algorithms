/*
Dual Pivot Quick Sort
======================
The idea of dual pivot quick sort is to take two pivots, one in the left end of the array and the second, 
in the right end of the array. The left pivot must be less than or equal to the right pivot, so we swap them if necessary. 

Algorithm
==========
LP: Left Pivot 
RP: Right Pivot

1.) Left Most elements in an array taken as LP(left pivot) and Rightmost elements are taken as the RP(Right Pivot).
2.) Swap Left pivot (Lp) with Right Pivot if LP greater then RP(if LP> RP).
3.) An array is a partition into 3 sub-array around left and right pivot.

Once a partition is done we perform over 3 stages recursively on three sub-array.
*/


public class DualPivotQuickSort{

    static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void dualPivotQuickSort(int[] array,int low, int high)
    {
        if (low < high)
        {

            // piv[] stores left pivot and right pivot. 
            // piv[0] means left pivot and 
            // piv[1] means right pivot 
            int[] piv;
            piv = partition(array, low, high);

            dualPivotQuickSort(array, low, piv[0] - 1);
            dualPivotQuickSort(array, piv[0] + 1, piv[1] - 1);
            dualPivotQuickSort(array, piv[1] + 1, high);
        }
    }

    static int[] partition(int[] arr, int low, int high)
    {
        if (arr[low] > arr[high])
            swap(arr, low, high);

        // p is the left pivot, and q 
        // is the right pivot. 
        int j = low + 1;
        int g = high - 1, k = low + 1,
                p = arr[low], q = arr[high];

        while (k <= g)
        {

            // If elements are less than the left pivot 
            if (arr[k] < p)
            {
                swap(arr, k, j);
                j++;
            }

            // If elements are greater than or equal 
            // to the right pivot 
            else if (arr[k] >= q)
            {
                while (arr[g] > q && k < g)
                    g--;

                swap(arr, k, g);
                g--;

                if (arr[k] < p)
                {
                    swap(arr, k, j);
                    j++;
                }
            }
            k++;
        }
        j--;
        g++;

        // Bring pivots to their appropriate positions. 
        swap(arr, low, j);
        swap(arr, high, g);

        // Returning the indices of the pivots 
        // because we cannot return two elements 
        // from a function, we do that using an array. 
        return new int[] { j, g };
    }

    // Driver code 
    public static void main(String[] args)
    {
        int[] arr = { 83, 7, 58, 31, 99, 5, 88, 15 };

        dualPivotQuickSort(arr, 0, 7);

        System.out.print("Sorted array: ");
        for (int i = 0; i < 8; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
