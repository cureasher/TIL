package code.four

fun checkFunc(num: Int?){
    checkNotNull(num)
    check(num!! >= 0)
}

fun requireFunc(num: Double?){
    requireNotNull(num)
    require(num!!.isNaN())
}

fun main(args: Array<String>) {
    checkFunc(10)
    requireFunc(0.0/0.0)
}