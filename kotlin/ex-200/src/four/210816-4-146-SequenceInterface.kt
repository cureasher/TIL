package code.four

fun main(args: Array<String>) {
    val seq: Sequence<Int> = sequenceOf(1,2,3)

    for( i in seq)
        print("$i ")
}