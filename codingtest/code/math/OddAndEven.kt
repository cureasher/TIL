package math

fun oddAndEven(number: Int): String = if(number % 2 == 0) "Even" else "Odd"

fun main() {
    println(oddAndEven(3))
    println(oddAndEven(4))
}