package section5

import model.Character

fun main() {
    /**
     * ・(セカンダリ) コンストラクタ
     *   >> プライマリコンストラクタも定義されている場合は、
     *          最終的にプライマリコンストラクタを呼び出す
     * ・this : 他のコンストラクタを呼び出す
     */

    val p1 = Character("プレイヤー1", 100)
    p1.showStatus()
    println()

    val p2 = Character("プレイヤー2")
    p2.showStatus()
    println()

    val p3 = Character(500)
    p3.showStatus()
    println()

    val p4 = Character()
    p4.showStatus()
    println()
}
