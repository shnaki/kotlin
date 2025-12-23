package model

class Enemy(name: String, hp: Int, var def: Int) : Character(name, hp) {

    init {
        count++
    }

    companion object {
        var count = 0
        fun showCount() {
            println(count)
        }
    }

    override fun showStatus() {
        println("名前: $name")
        println("HP: $hp")
        println("防御力: $def")
    }
}