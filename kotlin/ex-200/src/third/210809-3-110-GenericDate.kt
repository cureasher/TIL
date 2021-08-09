package code.third

fun <T> toDateFunction(dateText: T): () -> T = { dateText }
fun main(args: Array<String>) {
    val dateFunc: () -> String = toDateFunction<String>("현재 날짜 : 2021-08-09")
    println(dateFunc())
}