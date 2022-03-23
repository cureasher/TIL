package math

fun harshadNumber(x: Int): Boolean {
    return x % x.toString().toCharArray().sumBy { number -> number.toString().toInt()} == 0
}

fun main() {
    println(harshadNumber(10))
    println(harshadNumber(12))
    println(harshadNumber(11))
    println(harshadNumber(13))
}