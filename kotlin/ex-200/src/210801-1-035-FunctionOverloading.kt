package code

fun main(args: Array<String>) {
    // 함수이름이 같아도 매개변수가 타입 다르면 사용가능
    // println 윈도우 ctrl, 맥 cmc 버튼 누르고 클릭스 오버로딩 메서드 확인 가능
    printtest('A')
    printtest("Hello Function Overloading")
}

inline fun printtest(message: Char){
    println(message)
}

inline fun printtest(message: String){
    println(message)
}

