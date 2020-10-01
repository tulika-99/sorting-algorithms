import ShellSort.shellSort

/**
 * Kotlin implementation of ShellSort
 */
object ShellSort {
    /**
     * Function to sort an array using shell sorting algorithm
     */
    fun shellSort(array: IntArray): Int {
        val size = array.size
        var gap = size / 2
        while (gap > 0) {
            var i = gap
            while (i < size) {
                val temp = array[i]
                var j = i
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap]
                    j -= gap
                }
                array[j] = temp
                i += 1
            }
            gap /= 2
        }
        return 0
    }
}

/**
 *  Extension Function to print an array
 */
fun IntArray.print() {
    this.forEach {
        print("$it ")
    }
    println()
}

fun main() {
    val arr = intArrayOf(12, 34, 54, 2, 3)
    println("Before Sorting:")
    arr.print()
    shellSort(arr)
    println("After Sorting:")
    arr.print()
}
