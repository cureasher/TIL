package code.third

data class Salary(val name: String, val age: Int, val salary: Int)

fun main(args: Array<String>) {
    val (name, _, salary) = Salary("cureasher", 31, 3000)
    println("${name}, ${salary}")
}