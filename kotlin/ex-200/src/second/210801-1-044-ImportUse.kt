package code.second

import code.max // 패키지 추가
import code.getAverage as average // 패키지명 새로운 이름 설정

fun main(args: Array<String>) {
    println(max(55, 47))
    println(average(97,95))
}