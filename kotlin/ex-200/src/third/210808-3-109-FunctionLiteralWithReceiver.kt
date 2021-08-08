package code.third

fun main(args: Array<String>) {
    val makeCompare: Int.(left: Int, right: Int) -> Int

    makeCompare = { left: Int, right: Int ->
        if (this < left) left
        else if (this > right) right
        else this
    }
    // this와 left, right 비교 후 true인 것 출력
    println(15.makeCompare(20, 40))
    println(18.makeCompare(0, 50))
    println(25.makeCompare(0,19))
}