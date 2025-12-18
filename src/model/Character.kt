package model

class Character {
    var name: String = ""
        set(value) {
            field = if (value == "") {
                println("名前が正しくありません")
                "NO NAME"
            } else {
                value
            }
        }
        get() = field + "さん"
    var hp: Int

    val length: Int
        get() = name.length

    constructor(name: String, hp: Int) {
        this.name = name
        this.hp = hp
    }

    fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
    }
}