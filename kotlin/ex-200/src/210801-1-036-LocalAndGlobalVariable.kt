package code

var globalVarable = 0 // 전역변수 : 코틀린 파일에 있으면 접근 가
fun main(args: Array<String>) {
    val localVariable = 15 // 메인함수에서 사용 가능한 지역변수
    println(localVariable) // 지역변수 15 출력

    globalVarable++ // 전역변수 1증가 : 1

    printCount() // 전역변수 1 출력
    println(globalVarable) // 전역변수 2 출력
}

fun printCount(){
    println(globalVarable)
    globalVarable++ // 전역변수 1증가 : 2
}