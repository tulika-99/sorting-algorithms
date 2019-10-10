package com.exam.kotlin.codingproject

/**
 * Created by msaycon on 09,Oct,2019
 */
class HeapSort {
    companion object{

        fun heapSort(numbersToSort: IntArray) : IntArray {
            val n = numbersToSort.size

            for (i in n / 2 - 1 downTo 0){
                generateHeap(numbersToSort, n, i)
            }

            for (i in n - 1 downTo 0) {
                // Move current root to end
                val temp = numbersToSort[0]
                numbersToSort[0] = numbersToSort[i]
                numbersToSort[i] = temp

                generateHeap(numbersToSort, i, 0)
            }

            return numbersToSort
        }

        private fun generateHeap(arr: IntArray, n: Int, i: Int) {
            var largest = i // Initialize largest as root
            val l = 2 * i + 1 // left = 2*i + 1
            val r = 2 * i + 2 // right = 2*i + 2

            // If left child is larger than root
            if (l < n && arr[l] > arr[largest])
                largest = l

            // If right child is larger than largest so far
            if (r < n && arr[r] > arr[largest])
                largest = r

            // If largest is not root
            if (largest != i) {
                val swap = arr[i]
                arr[i] = arr[largest]
                arr[largest] = swap

                generateHeap(arr, n, largest)
            }
        }

    }
}