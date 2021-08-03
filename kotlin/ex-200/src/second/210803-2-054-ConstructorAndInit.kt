package code.second

class Animal constructor(name: String, age: Int){
    val name : String
    val age: Int

    init {
        this.name = name
        this.age = age
    }
}

fun main(args: Array<String>) {
    val animal = Animal("댕댕이", 7)
    println("이름: ${animal.name}")
    println("나이: ${animal.age}")
}