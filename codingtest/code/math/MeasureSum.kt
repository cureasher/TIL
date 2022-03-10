package math

fun solution(measure: Int): Int = (1..measure).filter { digit -> measure % digit == 0 }.sum()


fun main() {
    println(solution(12))
    println(solution(5))
}