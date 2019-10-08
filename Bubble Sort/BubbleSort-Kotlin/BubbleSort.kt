package com.exam.kotlin.codingproject

/**
 * Created by msaycon on 09,Oct,2019
 */
class BubbleSort {

    companion object {

        fun bubbleSort(numbersToSort: IntArray): IntArray {
            val n = numbersToSort.size
            for (i in 0 until n - 1) {
                for (j in 0 until n - i - 1) {
                    if (numbersToSort[j] > numbersToSort[j + 1]) {
                        // swap numbersToSort[j+1] and numbersToSort[i]
                        val temp = numbersToSort[j]
                        numbersToSort[j] = numbersToSort[j + 1]
                        numbersToSort[j + 1] = temp
                    }
                }
            }
            return numbersToSort
        }
    }
}