package code.second


open class Human(val name: String, val age: Int)

class Scholar(name: String, age: Int, val date: Int) : Human(name, age)
class Professor(name: String, age: Int):Human(name, age)

fun main(args: Array<String>) {
    val human: Human = Scholar("Mark Zuckerberg",33, 20171225)
    println("human is Human: ${human is Human}")
    println("human is Scholar: ${human is Scholar}")
    println("human is Professor: ${human is Professor}")

    val person: Human = Professor("Kim",48)
    println("person is Human: ${person is Human}")
    println("person is Scholar: ${person is Scholar}")
    println("person is Professor: ${person is Professor}")

}