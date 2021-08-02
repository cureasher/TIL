package code.second

class Person{
    var name: String =""
    var age: Int = 0
}

fun main(args: Array<String>) {
    val person: Person = Person()
    person.name = "cureasher"
    person.age = 31
    println("name: ${person.name}, age: ${person.age}")

    val person2 = Person()
    person2.name = "charles"
    person2.age = 30
    println("name: ${person2.name}, age: ${person2.age}")

    val person3 = Person()
    person3.name = "aiden"
    person3.age = 32
    println("name: ${person3.name}, age: ${person3.age}")
}