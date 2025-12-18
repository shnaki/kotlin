fun main() {
    /**
     * ・コレクション: 複数の値(要素)をまとめて扱う
     * ・可変長 (配列は固定長)
     * ・セット: 順序の概念がなく、要素の重複を許容しない
     */

    val set = mutableSetOf(10, 20, 30)
    println("set: $set")

    // 追加
    set.add(40)
    set.add(40)
    println("set: $set")

    // 削除
    set.remove(30)
    println("set: $set")
}