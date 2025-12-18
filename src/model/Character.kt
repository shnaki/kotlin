package model

open class Character(val name: String, val hp: Int) {
    fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
    }
}