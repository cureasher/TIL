package string

fun stringToInt(stringNumber: String) : Int = stringNumber.toInt()

fun main() {
    println(stringToInt("-1234"))
    println(stringToInt("1234"))
}