package model

abstract class Character(val name: String, val hp: Int) {
    protected open fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
    }
}