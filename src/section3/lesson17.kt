package section3

fun main() {
    /**
     * ・ループ (繰り返し)
     * ・for
     */

    for (i in 0..10) {
        println("i: $i")
    }

    for (j in 0 until 10) {
        println("j: $j")
    }

    for (k in 10 downTo 0) {
        println("k: $k")
    }

    for (l in 10 downTo 0 step 2) {
        println("l $l")
    }

    for (i in 1..9) {
        for (j in 1..9) {
            print("%3d".format(i * j))
        }
        println()
    }
}