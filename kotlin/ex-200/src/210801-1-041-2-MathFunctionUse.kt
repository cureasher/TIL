package code

fun main(args: Array<String>) {
    val number1 = 20
    val number2 = -30
    // 메인함수 안에 함수가 없지만 같은 폴더에 파일이 있으므로 사용 가능
    println(max(number1, abs(number2)))
}