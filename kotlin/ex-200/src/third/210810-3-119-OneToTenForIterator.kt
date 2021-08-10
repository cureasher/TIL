package code.third

fun main(args: Array<String>) {
    // 1~10까지 출력
    for (item: Int in 1..10){
        print("$item ")
    }
    println()

    // 1~10까지 중 5보다 작을동안만 출력
    // 타입 생략 가능
    for (item in 1..10){
        if (item > 5){
            break
        }
        print("$item ")
    }
}