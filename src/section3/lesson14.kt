package section3

fun main() {
    /**
     * ・if 条件分岐
     */

    val num = 120
    if (num > 100) {
        println("num > 100")
    } else if (num > 50) {
        println("num > 50")
    } else {
        println("その他")
    }

    val str = if (num > 100) {
        "num > 100"
    } else if (num > 50) {
        "num > 50"
    } else {
        "その他"
    }
    println("str: $str")
}