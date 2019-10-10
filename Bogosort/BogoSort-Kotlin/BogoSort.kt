package com.exam.kotlin.codingproject

import kotlin.random.Random

/**
 * Created by msaycon on 09,Oct,2019
 */
class BogoSort {

    companion object{
        private val randomValues = List(10) { Random.nextInt(0, 100) }

        private fun isSorted(arr: IntArray): Boolean {
            for (i in 0 until arr.size - 1) {
                if (arr[i] > arr[i + 1]) {
                    return false
                }
            }
            return true
        }

        fun bogoSort(numbersToSort: IntArray) : IntArray {
            while (!isSorted(numbersToSort)) {
                for (i in numbersToSort.indices) {
                    val randomIndex = randomValues[numbersToSort.size]
                    val holder = numbersToSort[i]
                    numbersToSort[i] = numbersToSort[randomIndex]
                    numbersToSort[randomIndex] = holder
                }
            }

            return numbersToSort
        }

    }
}