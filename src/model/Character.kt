package model

abstract class Character(val name: String, val hp: Int) {
    abstract fun showStatus()
}