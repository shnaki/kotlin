package section3

fun main() {
    /**
     * ・when 多岐分岐
     */

    val num = 50

    when (num) {
        5 -> println("num = 5")
        6, 7 -> println("num = 6 or 7")
        in 11..20 -> println("num in 11~20")
        else -> {
            println("その他")
            println("当てはまりません")
        }
    }

    val str = when (num) {
        5 -> "num = 5"
        6, 7 -> "num = 6 or 7"
        in 11..20 -> "num in 11~20"
        else -> {
            "その他"
            "当てはまりません"
        }
    }
    println("str: $str")

    val any: Any = 50.0
    when (any) {
        is Int -> println("Int")
        is Double -> println("Double")
        is String -> println("String")
    }
}