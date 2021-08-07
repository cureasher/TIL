package code.third

class Outer{
    class Nested  {
        fun hello() = println("Nested Class")
    }
}

fun main(args: Array<String>) {
    val instance: Outer.Nested = Outer.Nested()
    instance.hello()
}