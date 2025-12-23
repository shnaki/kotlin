package section2

fun main() {
    /**
     * 配列: 複数の値(要素)を保持する箱
     */

    var array: Array<Int> = arrayOf(10, 20, 30)
    println("array[0]: ${array[0]}")
    println("array[1]: ${array[1]}")
    println("array[2]: ${array[2]}")
//    println("array[3]: ${array[3]}")
    array[0] = 100
    println("array[0]: ${array[0]}")

    array.forEach { println("array[n]: $it") }

    val array1 = intArrayOf(10, 20, 30)
    val array2 = doubleArrayOf(10.0, 20.0)
    val array3 = arrayOfNulls<String>(5)
    array3.forEach { println(it) }
}