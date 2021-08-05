package code.second

// 문자열의 길이가 10이상이면 true 10보다 작으면 false
val String.isLarge: Boolean
    get() = this.length >= 10

fun main(args: Array<String>) {
    println("1234567890".isLarge)
    println("500원".isLarge)
}