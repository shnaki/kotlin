package section4

fun main() {
    /**
     * ・関数       : プログラムをまとめたもの
     * ・引数       : 関数に渡す値
     * ・戻り値     : 関数を実行したら返ってくる値
     * ・単一式関数 : 関数が単一式で構成される場合 {} が省略できる
     */

    val str = sayMessage("Hello")
    println("str: $str")

    sayMessageNoReturn("aaaa")

    val str2 = unionString("Hello", "World")
    println("str2: $str2")

    val str3 = unionString2("Hello", "Kotlin")
    println("str3: $str3")
}

fun sayMessage(str: String): String {
    return "Message: $str"
}

fun sayMessageNoReturn(str: String): Unit {
    println("Message: $str")
}

fun unionString(str1: String, str2: String): String {
    return str1 + str2
}

// 単一式関数
fun unionString2(str1: String, str2: String) = str1 + str2