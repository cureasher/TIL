package code.four

fun main(args: Array<String>) {
    val seq: CharSequence = "Hello"
    println("seq의 길이: ${seq.length}")
    println("seq[2]의 값: ${seq[2]}")
    println("seq의 0~2구간의 문자 값: ${seq.subSequence(0,2)}")
}