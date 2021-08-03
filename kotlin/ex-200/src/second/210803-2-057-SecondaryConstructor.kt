package code.second

// 주생성자
class Time constructor(val second: Int){
    init {
        println("init 블록 실행 중")
    }

    // 보조생성자1
    constructor(minute: Int, second: Int): this(minute * 60 + second){
        println("보조생성자 1 실행중")
    }

    // 보조생성자2
    constructor(hour: Int, minute: Int, second: Int): this(hour * 60 + minute, second){
        println("보조생성자 2 실행중")
    }

    init {
        println("또 다른 init 블록 실행 중")
    }
}

fun main(args: Array<String>) {
    println("${Time(15, 6).second} 초")
    println("${Time(6, 3, 17).second} 초")
}