package section3

fun main() {
    /**
     * ・ループ制御
     * ・break     : 脱出
     * ・continue  : スキップ
     * ・ラベル
     */

    // break
    for (i in 0..10) {
        if (i == 5) break
        println("i: $i")
    }


    // continue
    println()
    for (i in 0..10) {
        if (i % 2 == 0) continue
        println("i: $i")
    }

    println()
    for (i in 0..10) {
        for (j in 0..10) {
            if (j == 5) {
                break
            }
            print(j)
        }
        println()
    }

    // ラベル
    println()
    outer@ for (i in 0..10) {
        for (j in 0..10) {
            if (j == 5) {
                break@outer
            }
            print(j)
        }
        println()
    }
}