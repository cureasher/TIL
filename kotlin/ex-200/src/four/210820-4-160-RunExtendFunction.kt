package code.four

fun main(args: Array<String>) {
    val first = 10
    val second = 5

    (first * second - 2 * first).run {
        if (this > 0)
            println(this)
    }
}