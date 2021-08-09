package code.third

fun <T,R> T.map(multiply:(T)-> R): R{
    return multiply(this)
}

fun main(args: Array<String>) {
    val twoSquared: Int =
        11.map{
            it*it
        }
    println(twoSquared)
}