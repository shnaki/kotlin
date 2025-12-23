package section4

fun main() {
    /**
     * ・ラムダ式 : (匿名関数)
     * ・無名関数
     */

    // ラムダ式
    val num1 = calcC(5, 10) { x: Int, y: Int -> x + y }
    println("num1: $num1")
    println()

    // 無名関数
    val num2 = calcC(5, 10, fun(x: Int, y: Int): Int = x + y)
    println("num2: $num2")
}

fun calcC(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)
