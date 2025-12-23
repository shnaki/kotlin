package section7

import model.Fruits

fun main() {
    /**
     * ・データクラス
     *   >> データを管理することに特化したクラス
     *   >> メソッドを持つことはできない
     * ・toString, equals, copy, componentN
     */

    val f1 = Fruits("りんご", 100)
    val f2 = Fruits("りんご", 100)

    f1.area = "青森"
    f2.area = "長崎"

    println("f1: $f1")
    println("f1 == f2: ${f1 == f2}")

    val f3 = f1.copy(price = 200)
    println("f3: $f3")

    val name = f1.component1()
    println("name: $name")

    val (n, price) = f1
    println(
        "name: $n, price: $price"
    )
}
