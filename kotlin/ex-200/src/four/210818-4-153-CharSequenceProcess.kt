package code.four

fun main(args: Array<String>) {
    val whitespaceStr = "  hello  "
    println(whitespaceStr.removeRange(0..5))
    println(whitespaceStr.padStart(20,'*'))
    println(whitespaceStr.padEnd(17,'*'))

    println(whitespaceStr.trimStart())
    println(whitespaceStr.trimEnd())
    println(whitespaceStr.trim())

    println(whitespaceStr.slice(2..4))
    println(whitespaceStr.subSequence(5..7))
    println(whitespaceStr.substring(6..8))

    println(whitespaceStr.reversed())
}