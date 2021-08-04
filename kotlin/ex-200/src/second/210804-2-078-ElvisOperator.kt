package code.second

fun main(args: Array<String>) {
    val numbernull: Int? = null
    println(numbernull ?: 0)

    val numberfifteen: Int? = 15
    println(numberfifteen ?: 0)
    var text: String? = null
    println(text ?: "Hello")
}