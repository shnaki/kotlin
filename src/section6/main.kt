package section6

import model.Player

fun main() {
    /**
     * ・オーバーライド
     *     : スーパークラスのメソッドをサブクラスで上書きする
     * ・open 修飾子 : オーバーライドを許可する
     */

    val player = Player("プレイヤー", 100, 10)
    player.attack()
    player.showStatus()
}
