fun sort(ar: IntArray) {
    ar.indices.forEach { i ->
        (ar.size - 1 downTo i + 1).forEach { j ->
            if (ar[j] < ar[j - 1]) {
                ar[j] = ar[j - 1].also { ar[j - 1] = ar[j] }
            }
        }
    }
}

fun main(args: Array<String>) {
    val ar = intArrayOf(66, 27, 31, 17, 21, 96, 12, 183)
    sort(ar)
    println(ar.contentToString())
}
