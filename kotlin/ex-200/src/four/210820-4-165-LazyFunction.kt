package code.four

class LazyClass {
    var zeroNumber: Int = 0
    val lazyNumber by lazy { zeroNumber * 5 }
}

fun main(args: Array<String>) {
    val zero = LazyClass()
    println(zero.lazyNumber)
    zero.zeroNumber = 10
    println(zero.lazyNumber)

    val multiply = LazyClass()
    multiply.zeroNumber = 4
    println(multiply.lazyNumber)
}