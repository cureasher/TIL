package code

fun main(args: Array<String>) : Unit {
    val a: Int
    var b: Int
    a = 10 + 5
    b = 10

    b += a // b에 의 값을 누적
    println(b)

    b %= 3 // b를 3으로 나눈 나머지를 b에 저장
    println(b)

}