package code

fun main(args: Array<String>) {
    val first = -36
    val result = absolute(first)
    println(result)
}

fun absolute(second: Int): Int{
    return if(second > 0)
        second
    else
        -second
}