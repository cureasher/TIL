package code.four

fun main(args: Array<String>) {
    val nan:Double = 0.0/0.0
    val infinity:Double = 7/0.0
    val c: Double = 3.2

    print("$nan ")
    println(nan.isNaN())

    print("$infinity ")
    println(infinity.isInfinite())

    print("$c ")
    println(c.isFinite())
}