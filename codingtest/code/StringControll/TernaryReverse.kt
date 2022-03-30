package string

fun ternaryReverse(number: Int): Int {
    return number.toString(3).reversed().toInt(3)
}

fun main() {
    println(ternaryReverse(45))
    println(ternaryReverse(125))
}