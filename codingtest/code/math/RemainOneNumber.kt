package math

fun remainOneNumber(numbers: Int): Int {
    for (number in 2..numbers) {
        if (numbers % number == 1) {
            return number
        }
    }
    return -1
}
fun main() {
    println(remainOneNumber(10))
    println(remainOneNumber(12))
}