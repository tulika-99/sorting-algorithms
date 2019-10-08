fun sort(ar: IntArray) {
    val n = ar.size
    for (i in 0..n-2) {
        for (j in 0..n-i-2) {
            if (ar[j] > ar[j+1]) {
                ar[j] = ar[j+1].also { ar[j+1] = ar[j] }
            }
        }
    }
}

fun main(args: Array<String>) {
    val ar = intArrayOf(66, 27, 31, 17, 21, 96, 12, 183)
    sort(ar)
    println(ar.contentToString())
}
