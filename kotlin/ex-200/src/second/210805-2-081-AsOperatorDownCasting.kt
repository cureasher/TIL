package code.second

open class John(val name: String, val age: Int)

class Jack(name: String, age: Int, val date: Int) : John(name, age)

fun main(args: Array<String>) {
    val john : John = Jack("John", 42, 20210805)
    val johnSun: John = John("Jack",10)

    var tom: Jack = john as Jack
    println("${tom.name}, ${tom.age}, ${tom.date}")
    tom = johnSun as Jack
}