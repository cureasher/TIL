package code.four

fun main(args: Array<String>) {
    val list = mutableListOf(1,2,3)

    val iter: MutableIterator<Int> = list.iterator()

    println(iter)

    iter.next()
    iter.remove()
    println(list)

    iter.next()
    iter.remove()
    println(list)

}