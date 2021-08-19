package code.four

fun main(args: Array<String>) {
    val regex = Regex("[0-9]+")
    val numberString = "4324235"
    val numberString2 = "324 6546 5432"

    println("숫자형 문자망 있나요? ${regex.matches(numberString)}")
    println("숫자형 문자망 있나요? ${regex matches numberString2}")
    println(regex.replace(numberString2, "문자변환"))
}