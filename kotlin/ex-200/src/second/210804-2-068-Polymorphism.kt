package code.second

open class First {
    open fun hello() = println("Hello First")
}

class Second : First(){
    override fun hello() = println("Hello Second")
}

fun main(args: Array<String>) {
    val first = First()
    val second = Second()
    val third: First = second

    first.hello()
    second.hello()
    third.hello()
}