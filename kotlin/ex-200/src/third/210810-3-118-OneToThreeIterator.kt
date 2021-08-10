package code.third

fun main(args: Array<String>) {
    val range: IntRange = 1..3
    val iterator: Iterator<Int> = range.iterator()

    // iterator에 다음 원소가 있으면 True, 아니면 False
    println(iterator.hasNext())
    // iterator에 값이 있으면 값을 반환
    println(iterator.next())

    println(iterator.hasNext())
    println(iterator.next())

    println(iterator.hasNext())
    println(iterator.next())

    println(iterator.hasNext())

}