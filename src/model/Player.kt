package model

class Player(name: String, hp: Int, private var atk: Int) : Character(name, hp) {

    fun attack() {
        println("${name}の攻撃！${atk}のダメージ！")
    }

    public override fun showStatus() {
        super.showStatus()
        println("攻撃力: $atk")
    }
}