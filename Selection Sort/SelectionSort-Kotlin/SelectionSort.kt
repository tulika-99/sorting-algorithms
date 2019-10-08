fun sort(ar: IntArray) {
    ar.indices.forEach { i ->
        var minIndex = i
        for (j in i + 1 until ar.size) {
            if (ar[j] < ar[minIndex]) {
                minIndex = j
            }
        }
        ar[i] = ar[minIndex].also { ar[minIndex] = ar[i] }
    }
}

fun main(args: Array<String>) {
    val ar = intArrayOf(66, 27, 31, 17, 21, 96, 12, 183)
    sort(ar)
    println(ar.contentToString())
}
