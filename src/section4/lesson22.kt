package section4

fun main() {
    /**
     * ・デフォルト引数 : 引数を渡さなかった場合に自動的に使用される値
     * ・名前付き引数   : 関数呼び出し時に変数名を指定して呼び出す
     */

    val num = calcSquareArea(width = 10)
    println("num: $num")
}

fun calcSquareArea(height: Int = 5, width: Int) = height * width