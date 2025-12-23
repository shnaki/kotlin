package section3

fun main() {
    /**
     * ・for
     * ・配列, リスト, マップ
     */

    // 配列
    val array = arrayOf("りんご", "みかん", "ぶどう")
    for (fruit in array) {
        println(fruit)
    }

    // リスト
    val list = listOf("東京", "大阪", "京都")
    for ((index, city) in list.withIndex()) {
        println("city[$index]: $city")
    }
    for (index in list.indices) {
        println("city[$index]: ${list[index]}")
    }

    // マップ
    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three",
    )
    for (data in map) {
        println("data: $data")
    }
    for ((key, value) in map) {
        println("$key: $value")
    }
}