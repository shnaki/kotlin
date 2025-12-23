package model

// Type
// Element
class Generics<T>(var value: T) {
    fun display() {
        println(value)
    }
}

class GenericCharacter<T : Character>(var value: T) {
    fun display() {
        value.showStatus()
    }
}
