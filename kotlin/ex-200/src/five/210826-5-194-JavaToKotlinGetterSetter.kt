package code.five

import five.JavaClass

fun main(args: Array<String>) {
    val java = JavaClass()

    java.something = 301
    println(java.something)

    println(java.isGood)
    println(java.doubleValue)
}