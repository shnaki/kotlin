package section6

import model.Player

fun main() {
    /**
     * ・アクセス修飾子、可視性修飾子
     * ・internal  : 同一モジュール内からアクセス可能
     * ・public    : すべてのクラスからアクセス可能
     * ・protected : 現在のクラス及びサブクラスからアクセス可能
     * ・private   : 現在のクラスからのみアクセス可能
     */

    val p = Player("プレイヤー", 100, 10)
    p.showStatus()

    // private プロパティにはアクセスできない。
//    println("プレイヤーの攻撃力: ${p.atk}")
}
