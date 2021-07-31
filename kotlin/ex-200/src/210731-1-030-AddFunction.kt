package code

fun main(args: Array<String>) : Unit {
    println(AddFunction(3,6))
    println("3 + 6 + 9 = ${AddFunction(3,6)+ 9}")
}

fun AddFunction(number1: Int, number2: Int): Int{
    println("number1: $number1 number2: $number2 ")
    return number1 + number2
}