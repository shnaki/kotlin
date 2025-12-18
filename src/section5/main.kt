package section5

import model.Character

fun main() {
    /**
     * ・コンストラクタの既定値
     */

    val p1 = Character(hp = 100)
    p1.showStatus()
}
