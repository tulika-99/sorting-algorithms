fun sort(ar: IntArray, l: Int, r: Int) {
    if (r <= l) return

    val m = (l + r) / 2
    sort(ar, l, m)
    sort(ar, m + 1, r)

    val arLeft = ar.copyOfRange(l, m + 1)
    val arRight = ar.copyOfRange(m + 1, r + 1)

    var index = l
    var i = 0
    var j = 0
    while (i < arLeft.size && j < arRight.size) {
        ar[index++] = if (arLeft[i] < arRight[j]) {
            arLeft[i++]
        } else {
            arRight[j++]
        }
    }
    while (i < arLeft.size) ar[index++] = arLeft[i++]
    while (j < arRight.size) ar[index++] = arRight[j++]
}

fun main(args: Array<String>) {
    val ar = intArrayOf(66, 27, 31, 17, 21, 96, 12, 183)
    sort(ar, 0, ar.size - 1)
    println(ar.contentToString())
}
