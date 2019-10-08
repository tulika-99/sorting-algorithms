fun sort(ar: IntArray) {
    (1 until ar.size).forEach { i ->
        val el = ar[i]
        var j = i
        while (j > 0 && ar[j - 1] > el) {
            ar[j] = ar[--j]
        }
        ar[j] = el
    }
}

fun main(args: Array<String>) {
    val ar = intArrayOf(66, 27, 31, 17, 21, 96, 12, 183)
    sort(ar)
    println(ar.contentToString())
}
