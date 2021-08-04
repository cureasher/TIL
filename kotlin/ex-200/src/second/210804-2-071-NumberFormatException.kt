package code.second

fun main(args: Array<String>) {
    val text = "abcd"
    val number = text.toInt()

    println(number) // NumberFormatException 에러 발생
}