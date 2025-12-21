package section7

import model.Player

fun main() {
    /**
     * ・オブジェクト式
     */

    val weakPlayer = object : Player("モブ", 10, 1, 1) {
        override fun attack() {
            println("失敗！！")
        }
    }

    weakPlayer.attack()
}