package section6

import model.Player

fun main() {
    /**
     * ・インターフェース
     * ・多重実装
     */

    val p = Player("プレイヤー", 100, 10, 10)
    p.showStatus()
    p.healing()
    p.showStatus()
}
