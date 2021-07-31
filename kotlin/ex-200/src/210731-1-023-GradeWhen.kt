package code

fun main(args: Array<String>) : Unit {
    val score = 92

    println("test score")
    when( score / 10 ){
        9,10 -> {println("A")}
        8 -> {println("B")}
        7 -> {println("C")}
        6 -> {println("D")}
        else -> {println("F")}
    }
}