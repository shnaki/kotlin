fun main() {
    /**
     * ・変数 (var)  : 変更可能
     * ・定数'(val)  : 変更不可
     * ・型推論      : 代入するデータ型を判断する
     * ・データ型    : 「数値」「文字列」等、値の種類
     */

    // 変数
    var num = 10
    println("num = $num")
    println(num::class)

    num = 20
    println("num = $num")

    var str = "Hello"
    println("str = $str")
    println(str::class)

    str = "World"
    println("str = $str")

    // 定数
    val x = 10
}