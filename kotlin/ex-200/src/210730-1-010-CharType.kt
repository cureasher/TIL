package code

fun main(args: Array<String>) : Unit {
    var char: Char = 'A'
    println(char)

    char = '\uAC00'
    println(char)

    char = '한'
    println(char.toInt())

}