package section7

import model.Outer

fun main() {
    /**
     * ・インナークラス、ネストクラス
     */

    val outer = Outer(10)
    outer.display()
    println()

    outer.innerCreate(20)
    outer.obj.display()
    println()

    val innerObj = outer.innerCreateReturn(30)
    innerObj.display()
}