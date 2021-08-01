package code

var overlapVariable = "전역변수 출력"
fun main(args: Array<String>) {
    // 변수 우선순위 : 지역변수와 전역변수 중 가까운 변수 인식
    val overlapVariable = "지역변수 출력"
    println(overlapVariable)
    Globalfun()
}

fun Globalfun() {
    println(overlapVariable)
}
