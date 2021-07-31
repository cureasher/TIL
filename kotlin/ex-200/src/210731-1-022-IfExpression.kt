package code

fun main(args: Array<String>) : Unit {
    val number = if(10 > 5){
        println("10은 5보다 크다")
        10
    } else {
        println("10은 5보다 크지 않다")
        5
    }
    println(number)

    val value1 = if(10 > 5) {}
        else {}
    println(value1) // 문장이 비어 있으므로 의미없는 값이 저장됨

    val value2 = if(10 > 5) {
        val value1 = 10
    } else {
        val value1 = 5
    }
    println(value2)
    // 변수에 값을 저장한 것으로 끝나므로 의미 없는 값이 저장
}