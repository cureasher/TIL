package code.third

data class Company(val name:String, val age:Int, val salary:Int)

fun main(args: Array<String>) {
    val first = Company("John",30, 3000)
    val second = Company("Page", 24, 5300)
    val third = first.copy()

    println(first.toString())
    println(third.toString())
    println(second.toString())
    println(first == second)
    println(first == third)

}