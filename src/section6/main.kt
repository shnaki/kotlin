package section6

import model.Character
import model.Player

fun main() {
    /**
     * ・キャスト
     * ・アップキャスト : サブ -> スーパー
     * ・ダウンキャスト : スーパー -> サブ
     */

    val p = Player("プレイヤー", 100, 10, 10)

    // アップキャスト
    val ch: Character = p
    ch.showStatus()

    // ダウンキャスト
    val player = ch as Player
    player.attack()

    // スマートキャスト
    if (ch is Player) {
        ch.attack()
        val pp: Player = ch
    }

    // ダウンキャストが成立しない場合の例。
    // atk
//    val c = Character("キャラクター", 100)
//    val ppp = c as Player
//    player.attack()
}
