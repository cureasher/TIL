package code.four

import java.io.Serializable

data class DataPair<out A, out B>(
    val first: A,
    val second: B): Serializable

fun divide(first_num: Int, second_num: Int): DataPair<Int, Int> =
    DataPair(first_num / second_num, first_num % second_num)

fun main(args: Array<String>) {
    val(quotient,remainder) = divide(10,3)
    println("몫: $quotient")
    println("나머지: $remainder")
}