package section2

fun main() {
    /**
     * ・型推論
     * ・データ型の種類
     * ・データ型を指定する
     */

    // 型推論: 代入する値で自動的にデータ型を識別する
    val x = 10
    val y = 1.0
    val z = "hello"
    println("x = ${x::class}")
    println("y = ${y::class}")
    println("z = ${z::class}")

    // 整数
    val num1: Int = 10   // 32 bit
    val num2: Long = 10  // 64 bit
    val num21 = 10L      // 64 bit
    val num3: Short = 10 // 16 bit
    val num4: Byte = 10  //  8 bit
    println(num1::class)
    println(num2::class)
    println(num21::class)
    println(num3::class)
    println(num4::class)

    // 小数
    val numF1: Double = 1.0  // 64 bit
    val numF2: Float = 1.0F  // 32 bit
    println(numF1::class)
    println(numF2::class)

    // 符号なし整数
    val numU1: UByte = 255U
    println(numU1::class)

    // 進数表現
    val numHex = 0xF0
    val numBin = 0b1111_0000
    println(numHex::class)
    println(numBin::class)

    // 文字列, 文字
    val str: String = "hello"
    val ch: Char = 'S'
    println(str::class)
    println(ch::class)

    // 真偽値 Boolean
    // true or false
    val bool: Boolean = true
    println(bool::class)
    println(10 < 5)

    // Any
    var any: Any = 10
    any = "hello"
    any = 'C'
    println(any::class)
}
