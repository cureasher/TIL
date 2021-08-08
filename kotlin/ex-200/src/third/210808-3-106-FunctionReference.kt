package code.third

fun plusReference(number1: Int, number2: Int) = println("ObjectReference 함수 호출: ${number1+number2}")

object ObjectReference {
    fun minus(number1: Int, number2: Int) = println("ObjectReference mius Object 함수 호출: ${number1-number2}")
}

class ClassReference {
    fun average(number1: Int, number2: Int) = println("ClassReference mius Class 함수 호출: ${(number1+number2)/2}")
}

fun main(args: Array<String>) {
    var calcualte: (Int, Int) -> Unit
    calcualte = ::plusReference
    calcualte(60, 27)

    calcualte = ObjectReference::minus
    calcualte(36, 12)

    calcualte = ClassReference()::average
    calcualte(25, 15)
}
