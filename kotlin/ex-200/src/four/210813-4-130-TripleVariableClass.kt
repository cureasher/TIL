package code.four

import java.io.Serializable

data class TripleVariable<out A, out B, out C>(
    val first: A,
    val second: B,
    val trhird: C): Serializable

fun calculateCircle(radius: Int): TripleVariable<Int, Double, Double> =
    TripleVariable(radius * 2,radius * 2 * 3.14,3.14 * radius*radius)

fun main(args: Array<String>) {
    val (diameter, _, area) = calculateCircle(5)
    println("지름: $diameter")
    println("넓이: $area")
}