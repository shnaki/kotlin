package model

class Character(var name: String, var hp: Int) {

    constructor(name: String) : this(name, 50) {
        println("** セカンダリ  **")
    }

    constructor(hp: Int) : this("プレイヤー3", hp)

    constructor() : this("プレイヤー4", 10)

    fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
    }
}