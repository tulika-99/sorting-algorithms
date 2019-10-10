package com.exam.kotlin.codingproject

/**
 * Created by msaycon on 08,Oct,2019
 */

class CountingSort {

    companion object {

        fun sortNumbers(numbersToSort: IntArray): IntArray {
            if (numbersToSort.size < 2) {
                return numbersToSort
            }

            var min = numbersToSort[0]
            var max = numbersToSort[0]

            // We recover the minimum and maximum value ...
            for (i in 1 until numbersToSort.size) {
                if (numbersToSort[i] < min) {
                    min = numbersToSort[i]
                } else if (numbersToSort[i] > max) {
                    max = numbersToSort[i]
                }
            }

            // ... to create an optimized table ...
            val intermediateTable = IntArray(max - min + 1)

            // ... whose values are initialized to zero.
            for (i in intermediateTable.indices) {
                intermediateTable[i] = 0
            }

            // We count the number of occurrences of a value and
            // we add it to the index of the value - min
            for (i in numbersToSort.indices) {
                intermediateTable[numbersToSort[i] - min]++
            }

            // We fill the table with the number of times a value
            // has been repeated. The cursor represents the index
            // of the table to fill
            var cursor = 0
            for (i in intermediateTable.indices) {
                for (j in 0 until intermediateTable[i]) {
                    numbersToSort[cursor++] = i + min
                }
            }

            return numbersToSort
        }
    }
}