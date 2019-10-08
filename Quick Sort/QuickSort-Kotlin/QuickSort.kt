fun sort(ar: IntArray, l: Int, r: Int) {
    if (r <= l) return

    var pivot = r
    var i = pivot - 1
    while (i >= l) {
        if (ar[i] > ar[pivot]) {
            ar[i] = ar[pivot - 1].also { ar[pivot - 1] = ar[i] }
            ar[pivot] = ar[pivot - 1].also { ar[pivot - 1] = ar[pivot] }
            pivot--
        }
        i--
    }

    sort(ar, l, pivot - 1)
    sort(ar, pivot + 1, r)
}

fun main(args: Array<String>) {
    val ar = intArrayOf(66, 27, 31, 17, 21, 96, 12, 183)
    sort(ar, 0, ar.size - 1)
    println(ar.contentToString())
}
