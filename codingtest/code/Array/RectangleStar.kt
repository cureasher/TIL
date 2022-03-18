package array

fun main(args: Array<String>) {
    val (rows, columns) = readLine()!!.split(' ').map(String::toInt)
    (1..columns).forEach { _ ->
        (1..rows).forEach { _ ->
            print("*")
        }
        println()
    }
}