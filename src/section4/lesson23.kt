package section4

fun main() {
    /**
     * ・戻り値を複数返す
     * ・Pair: 2つ
     */

    val (sum, max) = sumMax(20, 10, 50, 30, 40)
    println("sum: $sum, max: $max")

    val (sum2, _) = sumMax(20, 10, 50)
    println("sum2: $sum2")

    val pair = sumMax(20, 10, 50, 30)
    println("sum: ${pair.first}, max: ${pair.second}")
}

fun sumMax(vararg array: Int): Pair<Int, Int> {
    var sum = 0
    var max = Int.MIN_VALUE
    for (i in array) {
        sum += i
        max = maxOf(max, i)
    }
    return Pair(sum, max)
}