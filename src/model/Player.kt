package model

class Player : Character {
    var atk: Int

    constructor(name: String, hp: Int, atk: Int) : super(name, hp) {
        this.atk = atk
    }

    fun attack() {
        println("${name}の攻撃！${atk}のダメージ！")
    }

    override fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
        println("攻撃力: $atk")
    }
}