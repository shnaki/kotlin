package model

class Player(name: String, hp: Int, var atk: Int) : Character(name, hp) {
    fun attack() {
        println("${name}の攻撃！${atk}のダメージ！")
    }
}