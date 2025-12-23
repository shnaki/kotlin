package section7

fun main() {
    /**
     * ・ジェネリクス関数
     */

    val numList = listOf(1, 2, 3, 4, 5)
    val x = getMiddle(numList)
    println("x: $x")

    val strList = listOf("A", "B", "C", "D", "E")
    println("middleStr: ${getMiddle(strList)}")
}

fun <T> getMiddle(list: List<T>): T {
    return list[list.size / 2]
}