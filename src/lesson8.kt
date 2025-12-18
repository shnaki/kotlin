fun main() {
    /**
     * ・コレクション: 複数の値(要素)をまとめて扱う
     * ・可変長 (配列は固定長)
     * ・リスト: 順番の概念を持つ
     */

    val list = mutableListOf(10, 20, 30)
    println("list[0]: ${list[0]}")
    println("list[1]: ${list[1]}")
    println("list[2]: ${list[2]}")

    list[0] = 100
    println("list[0]: ${list[0]}")
    println("list: $list")

    // 追加
    list.add(200)
    println("list: $list")

    list.add(0, 500)
    println("list: $list")

    // 削除
    list.removeAt(0)
    println("list: $list")

    list.remove(100)
    println("list: $list")
}