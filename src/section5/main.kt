package section5

import model.Character

fun main() {
    /**
     * ・(プライマリ) コンストラクタ
     * ・プロパティ宣言
     */

    val p1 = Character("プレイヤー1", 100)
    p1.showStatus()
    println()

    val p2 = Character("プレイヤー2", 200)
    p2.showStatus()
}
