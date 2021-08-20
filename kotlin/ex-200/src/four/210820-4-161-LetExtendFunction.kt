package code.four

fun main(args: Array<String>) {
    val first = 10
    val second = 5

    (first * second - 2 * first).let { result: Int ->
        if (result > 0)
            println(result)
    }
}