package section7

import model.Enemy

fun main() {
    /**
     * ・コンパニオンオブジェクト
     */

    val e1 = Enemy("敵1", 100, 10)
    Enemy.showCount()

    val e2 = Enemy("敵2", 100, 10)
    Enemy.showCount()

    val e3 = Enemy("敵3", 100, 10)
    Enemy.showCount()
}