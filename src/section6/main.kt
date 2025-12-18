package section6

import model.Player

fun main() {
    /**
     * ・継承 (インヘリタンス)
     * ・スーパークラス (親クラス, 基底クラス)
     * ・サブクラス (子クラス, 派生クラス)
     * ・open 修飾子 : 継承を許可する
     */

    val player = Player("プレイヤー", 100, 10)
    player.attack()
    player.showStatus()
}
