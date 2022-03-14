package math

fun solution(numbers: Long): Long = String(numbers.toString().toCharArray().sortedArrayDescending()).toLong()

fun main() {
    println(solution(118372))
}