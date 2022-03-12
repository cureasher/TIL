package array

fun solution(numbers : Long) : IntArray = numbers.toString().reversed().map { number -> number.toString().toInt() }.toIntArray()

fun main() {
    println(solution(12345).toList())
}