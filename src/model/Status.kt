package model

sealed class Status {
    object Enable : Status()
    object Disable : Status()
    class Error(val str: String) : Status()

    class A() : Status() {

    }
}

class B() : Status() {

}


enum class StatusTest {
    Enable,
    Disable,
    Error,
}