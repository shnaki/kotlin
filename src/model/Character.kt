package model

class Character(val name: String = "PLAYER", val hp: Int) {
    fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
    }
}