package section7

import model.AppInfo

fun main() {
    /**
     * ・オブジェクト宣言
     * ・(シングルトン)
     */

    AppInfo.display()
    AppInfo.name = "ZZ GAME"
    AppInfo.display()
}