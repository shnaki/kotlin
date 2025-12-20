package model

open class Character(val name: String, val hp: Int) {
    open fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
    }
}