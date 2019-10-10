package com.exam.kotlin.codingproject

/**
 * Created by msaycon on 09,Oct,2019
 */
class ShellSort {

    companion object {

        fun sort(numbersToSort: IntArray): IntArray {
            val n = numbersToSort.size

            // Start with a big gap, then reduce the gap
            var gap = n / 2
            while (gap > 0) {
                // Do a gapped insertion sort for this gap size.
                // The first gap elements a[0..gap-1] are already
                // in gapped order keep adding one more element
                // until the entire array is gap sorted
                var i = gap
                while (i < n) {
                    // add a[i] to the elements that have been gap
                    // sorted save a[i] in temp and make a hole at
                    // position i
                    val temp = numbersToSort[i]

                    // shift earlier gap-sorted elements up until
                    // the correct location for a[i] is found
                    var j: Int
                    j = i
                    while (j >= gap && numbersToSort[j - gap] > temp) {
                        numbersToSort[j] = numbersToSort[j - gap]
                        j -= gap
                    }

                    // put temp (the original a[i]) in its correct
                    // location
                    numbersToSort[j] = temp
                    i += 1
                }
                gap /= 2
            }

            return numbersToSort
        }
    }
}