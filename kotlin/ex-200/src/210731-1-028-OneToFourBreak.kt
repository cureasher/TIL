package code

fun main(args: Array<String>) : Unit {
    var number = 0
    while (true){
        number++
        if (number >= 5)
            break // number가 5가되면 while문 탈출
        print(number)
    }
}