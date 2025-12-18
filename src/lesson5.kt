fun main() {
    /**
     * ・型変換メソッド (toXX)
     * ・メソッド: クラスが持っている関数 (プログラムをまとめたもの)
     */

    // 以下のような代入はできない
    val x: Int = 10
    val y: Long = x.toLong()
    println("y: $y")

    val d: Double = x.toDouble()
    println("d: $d")

    val dd = 1.6
    val i: Int = dd.toInt()
    println("i: $i")
}