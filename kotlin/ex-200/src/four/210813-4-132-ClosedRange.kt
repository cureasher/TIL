package code.four

interface ClosedRange<T: Comparable<T>>{
    val start: T
    val endInculsive: T
    operator fun contains(value:T):Boolean = value >= start && value <= endInculsive
    fun isEmpty(): Boolean = start > endInculsive
}

fun main(args: Array<String>) {
    val intRange: IntRange = 1..10
    val longRange: LongRange = 1L..100L
    val charRange: CharRange = 'A'..'Z'

    println("intRange의 start 값: ${intRange.start}")
    println("longRange end 값: ${longRange.endInclusive}")
    println("*가 charRange에 있나요?: ${'*' in charRange}")
    println("charRange가 비어있나요?: ${charRange.isEmpty()}")
}