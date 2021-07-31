package code

fun main(args: Array<String>) : Unit {
    println(FahrenheitChange(30))
    // 30섭씨를 화씨로 변경
}

fun FahrenheitChange(fahrenheit : Int) : Double{

    return fahrenheit * 1.8 + 32
}