import BrickSort.sort
import BrickSort.printArray

object BrickSort {
    fun sort(array: IntArray, size: Int) {
        var isSorted = false
        while (!isSorted) {
            isSorted = true
            var temp = 0
            run {
                var i = 1
                while (i <= size - 2) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i]
                        array[i] = array[i + 1]
                        array[i + 1] = temp
                        isSorted = false
                    }
                    i += 2
                }
            }
            var i = 0
            while (i <= size - 2) {
                if (array[i] > array[i + 1]) {
                    temp = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = temp
                    isSorted = false
                }
                i += 2
            }
        }
        return
    }
    fun printArray(array: IntArray) {
        println(array.joinToString(" "))
    }
}

fun main() {
    val array = intArrayOf(2, 8, 1, 4, 7, 3, 5, 1)
    val size = array.size
    println("Array Before Sorting:")
    printArray(array)
    sort(array, size)
    println("Array Before Sorting:")
    printArray(array)
}