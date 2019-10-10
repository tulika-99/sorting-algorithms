package com.exam.kotlin.codingproject

/**
 * Created by msaycon on 09,Oct,2019
 */
class GnomeSort {
    fun gnomeSort(numbersToSort: IntArray, numbersLength: Int) : IntArray {
        var index = 0

        while (index < numbersLength) {
            if (index == 0)
                index++
            if (numbersToSort[index] >= numbersToSort[index - 1])
                index++
            else {
                var temp = 0
                temp = numbersToSort[index]
                numbersToSort[index] = numbersToSort[index - 1]
                numbersToSort[index - 1] = temp
                index--
            }
        }
        return numbersToSort
    }
}