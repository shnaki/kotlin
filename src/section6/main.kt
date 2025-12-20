package section6

import model.Character
import model.Enemy
import model.Player

fun main() {
    /**
     * ・abstract : オーバーライドを強制させる
     *     >> 抽象クラス、抽象メソッド
     * ・ポリモーフィズム、多態性
     */

    val p = Player("プレイヤー", 100, 10)
    val e = Enemy("エネミー", 50, 5)
    val list: List<Character> = listOf(p, e)
    for (obj in list) {
        println("== ${obj::class} ==")
        obj.showStatus()
    }
}
