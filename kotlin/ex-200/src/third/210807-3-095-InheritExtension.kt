package code.third

open class Parent
class Child : Parent()

fun Parent.hello() = println("Parent")
fun Child.hello() = println("Child")

fun main(args: Array<String>) {
    val inherit: Parent = Child()
    inherit.hello()

}