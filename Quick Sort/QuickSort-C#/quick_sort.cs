/* Quick sort implementation using C#*/
using System;
namespace QuickSortDemo {
   class Example {

      /* This function takes first element as pivot, 
        places the pivot element at its correct 
        position in sorted array, and places all 
        smaller (smaller than pivot) to left of 
        pivot and all greater elements to right of pivot */ 
      static public int Partition(int[] arr, int left, int right) {
         int pivot;
         pivot = arr[left];
         while (true) {
            while (arr[left] < pivot) {
               left++;
            }
            while (arr[right] > pivot) {
               right--;
            }
            if (left < right) {
               int temp = arr[right];
               arr[right] = arr[left];
               arr[left] = temp;
            } else {
               return right;
            }
         }
      }

        /* The main function that implements QuickSort 
        arr[] --> Array to be sorted, 
        left --> Starting index, 
        right --> Ending index */
      static public void quickSort(int[] arr, int left, int right) {
         int pivot;
         if (left < right) {
            pivot = Partition(arr, left, right);
            if (pivot > 1) {
               quickSort(arr, left, pivot - 1);
            }
            if (pivot + 1 < right) {
               quickSort(arr, pivot + 1, right);
            }
         }
      }

      static void Main(string[] args) {
         int[] arr = {67, 12, 95, 56, 85, 1, 100, 23, 60, 9}; 
         int n = 10, i;
         Console.WriteLine("Quick Sort");
         Console.WriteLine("----------");
         Console.Write("Initial Array is: ");   
         for (i = 0; i < n; i++) {
            Console.Write(arr[i] + " ");
         }
         quickSort(arr, 0, 9);
         Console.Write("\nSorted Array is: ");   
         for (i = 0; i < n; i++) {
            Console.Write(arr[i] + " ");
         }
      }
   }
}