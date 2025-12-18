fun main() {
    /**
     * ・null 安全性    (Null Safety)
     * ・null 許容型    (Nullable)
     * ・null 非許容型  (Non-null)
     */

    // null 許容型
    val str: String? = null
    println(str ?: "".length)

    // !!
    val list: MutableList<Int> = mutableListOf(10, 20, 30)
    val num: Int? = list.min()

    // スマートキャスト
    if (num != null) {
        println(num * 2)
    }

    // !!
    println(num!! * 2)
}