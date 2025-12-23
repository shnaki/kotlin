package section7

import model.GenericCharacter
import model.Generics
import model.Player

fun main() {
    /**
     * ・ジェネリクス型 : インスsタンス化を行うときにデータ型を渡す
     */

    val str: Generics<String> = Generics("ABC")
    str.display()

    val int = Generics<Int>(100)
    int.display()

    // これはエラー。
//    int.value = "str"

    val p = GenericCharacter(Player("プレイヤー", 100, 10, 10))
    p.display()
}
