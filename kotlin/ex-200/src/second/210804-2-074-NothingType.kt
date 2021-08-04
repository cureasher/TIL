package code.second

import java.lang.Exception

fun main(args: Array<String>) {
    println("start")
    val number: Int = throwing()
    println(number)
}

fun throwing(): Nothing = throw Exception()