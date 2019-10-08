fun sort(ar: IntArray) {
    val min = ar.min()!!
    val max = ar.max()!!

    val count = IntArray(size = max - min + 1)
    ar.forEach { el -> count[el - min]++ }

    var index = 0
    count.indices.forEach { el ->
        repeat(count[el]) {
            ar[index++] = el + min
        }
    }
}

fun main(args: Array<String>) {
    val ar = intArrayOf(66, 27, 31, 17, 21, 96, 12, 183, 66, 17, 96)
    sort(ar)
    println(ar.contentToString())
}
