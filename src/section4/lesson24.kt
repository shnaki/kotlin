package section4

fun main() {
    /**
     * ・戻り値を複数返す
     * ・Triple: 3つ
     */

    val (sum, max, min) = sumMaxMin(20, 10, 50, 30, 40)
    println("sum: $sum, max: $max, min: $min")

    val triple = sumMaxMin(20, 0, 40, 30)
    println("sum: ${triple.first}, max: ${triple.second}, min: ${triple.third}")
}

fun sumMaxMin(vararg array: Int): Triple<Int, Int, Int> {
    var sum = 0
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    for (i in array) {
        sum += i
        max = maxOf(max, i)
        min = minOf(min, i)
    }
    return Triple(sum, max, min)
}