package code.second

fun main(args: Array<String>) {
    println("o가 kotlin에 포함한다: ${'o' in "kotlin"}")
    println("in이 kotlin에 포함 안한다: ${"in" !in "Kotlin"}")
}