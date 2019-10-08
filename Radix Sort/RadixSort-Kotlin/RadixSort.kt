package com.exam.kotlin.codingproject

import java.util.*

/**
 * Created by msaycon on 09,Oct,2019
 */
class RadixSort {

    companion object {

        // A utility function to get maximum value in arr[]
        fun getMax(arr: IntArray, n: Int): Int {
            var mx = arr[0]
            for (i in 1 until n)
                if (arr[i] > mx)
                    mx = arr[i]
            return mx
        }

        // does counting sort
        fun countSort(arr: IntArray, n: Int, exp: Int) {
            val output = IntArray(n)
            var i: Int
            val count = IntArray(10)
            Arrays.fill(count, 0)
            i = 0
            while (i < n) {
                count[arr[i] / exp % 10]++
                i++
            }
            i = 1
            while (i < 10) {
                count[i] += count[i - 1]
                i++
            }
            i = n - 1
            while (i >= 0) {
                output[count[arr[i] / exp % 10] - 1] = arr[i]
                count[arr[i] / exp % 10]--
                i--
            }

            i = 0
            while (i < n) {
                arr[i] = output[i]
                i++
            }
        }

        // The main function to that sorts numbersToSort[] of size n using Radix Sort
        fun radixsort(numbersToSort: IntArray, n: Int) : IntArray {
            // Find the maximum number to know number of digits
            val m = getMax(numbersToSort, n)

            // Do counting sort for every digit. Note that instead
            // of passing digit number, exp is passed. exp is 10^i
            // where i is current digit number
            var exp = 1
            while (m / exp > 0) {
                countSort(numbersToSort, n, exp)
                exp *= 10
            }

            return numbersToSort
        }
    }
}