package code.second

open class User(val name: String, val age: Int)

class Student(name: String, age: Int, val date: Int) : User(name, age)

fun main(args: Array<String>) {
    val user = User("cureasher", 31)
    val student = Student("asher", 27, 20210804)

    println("${user.name}, ${user.age}")
    println("${student.name}, ${student.age}, ${student.date}")
}