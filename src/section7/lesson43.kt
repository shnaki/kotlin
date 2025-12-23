package section7

import model.Week

fun main() {
    /**
     * ・enum 型、列挙型
     */

    val day: Week = Week.Sunday
    println("day = ${day}")
    println("day.value = ${day.value}")
    println("day.ordinal = ${day.ordinal}")
    println()

    if (day == Week.Saturday) {
        println("It's Saturday!")
    }
    println()

    when (day) {
        Week.Saturday -> println("It's Saturday!")
        else -> {}
    }
    println()

    for (w in Week.values()) {
        println("$w = ${w.value}")
    }
}