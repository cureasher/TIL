package code.third

fun main(args: Array<String>) {
    val oneToTen: IntRange = 1..10
    println("5는 1~10 안에 있다: ${5 in oneToTen}")
    println(oneToTen)
    println(11.rangeTo(20))
    val upperAtoZ: CharRange = 'A'..'Z'

    if ('C' in upperAtoZ)
        println("C는 대문자입니다.")

    if ('p' in 'a'..'z')
        println("p는 소문자입니다.")

    println('a'.rangeTo('z'))
    println(upperAtoZ)
}