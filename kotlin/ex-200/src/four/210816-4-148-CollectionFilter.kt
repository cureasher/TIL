package code.four

fun main(args: Array<String>) {
    val to10 = 1..10

    println(to10.filter{it % 4 == 0})
    println(to10.filterNot{it % 4 == 0})
    println(to10.filterNotNull())
    println(to10.filterIndexed{index, element-> element > 5})
    println(to10.filterIsInstance<Long>())
}