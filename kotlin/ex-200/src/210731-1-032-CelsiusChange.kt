package code

fun main(args: Array<String>) : Unit {
    celsiusChange(86)
}

fun celsiusChange(celsius: Int): Unit{
    println((celsius-32)/1.8)
    // return 없어도 실행
}