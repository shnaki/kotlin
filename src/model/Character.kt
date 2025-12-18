package model

class Character(var name: String, var hp: Int) {

    fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
    }
}