package math

fun numberOfIntervals(integerNumber: Int, natureNumber: Int): LongArray = LongArray(natureNumber) {repeatCount -> integerNumber.toLong() * (repeatCount + 1) }

fun main() {
    println(numberOfIntervals(2,5).toList())
    println(numberOfIntervals(4,3).toList())
    println(numberOfIntervals(-4,2).toList())
}