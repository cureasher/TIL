package math

fun integerSquareRootCheck(number: Long): Long {
    return if(Math.sqrt(number.toDouble()) % 1.0 == 0.0) Math.pow(Math.sqrt(number.toDouble()) + 1, 2.0).toLong() else -1L
}

fun main() {
    println(integerSquareRootCheck(121))
    println(integerSquareRootCheck(3))
}