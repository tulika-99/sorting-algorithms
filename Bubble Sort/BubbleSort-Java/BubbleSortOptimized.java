/*
Earlier Bubble Sort Algorithm was doing unnecessary iterations even after the array was already sorted. In this Solution we will break the iteration if after one full Iteration it doesn't find any values to swap, which means Array is already Sorted.

Number of Iterations Before Changes:
[5, 2, 9, 1, 7, 3, 4, 505, 200]
[2, 5, 1, 7, 3, 4, 9, 200, 505]
[2, 1, 5, 3, 4, 7, 9, 200, 505]
[1, 2, 3, 4, 5, 7, 9, 200, 505]
[1, 2, 3, 4, 5, 7, 9, 200, 505]
[1, 2, 3, 4, 5, 7, 9, 200, 505]
[1, 2, 3, 4, 5, 7, 9, 200, 505]
[1, 2, 3, 4, 5, 7, 9, 200, 505]
[1, 2, 3, 4, 5, 7, 9, 200, 505]

Number of Iterations After Changes:
[5, 2, 9, 1, 7, 3, 4, 505, 200]
[2, 5, 1, 7, 3, 4, 9, 200, 505]
[2, 1, 5, 3, 4, 7, 9, 200, 505]
[1, 2, 3, 4, 5, 7, 9, 200, 505]
[1, 2, 3, 4, 5, 7, 9, 200, 505]
*/
public class BubbleSort
{
  void bubbleSort(int arr[])
    {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++){
            swapped=false;
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            if(!swapped){
		    break;
		    }
        }
    }
    
    
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {5, 2, 9, 1, 7, 3, 4, 505, 200};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
