package section5

import model.Character

fun main() {
    /**
     * ・アクセッサ ( get: ゲッター, set: セッター )
     *   >> 代入時・取得時に自動的に呼ばれる
     * ・バッキングフィールド ( field )
     */

    val p1 = Character("プレイヤー1", 100)
    p1.showStatus()
    println()

    p1.name = ""
    p1.showStatus()
}
