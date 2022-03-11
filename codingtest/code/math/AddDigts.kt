package math

fun addDigits(number: Int): Int {
    var digitSum = 0
    number.toString().forEach { digit ->
        digitSum += digit.toString().toInt()
    }
    return digitSum
}
fun main() {
    println(addDigits(123))
    println(addDigits(987))
}