package code.third

fun main(args: Array<String>) {
    val tenToForty: Array<Int> = arrayOf<Int>(10,20,30,40)

    println("tenToForty 배열의 크기: ${tenToForty.size}")
    println("tenToForty 배열의 2번째 원소: ${tenToForty[1]}")

    for (item in tenToForty) {
        print("$item ")
    }
}