package code.four

fun main(args: Array<String>) {
    val list = listOf(43, 76, 28, 19, 22, 68)

    println("정렬 전: $list")
    println("오름차순 정렬: ${list.sorted()}")
    println("내림차순 정렬: ${list.sortedDescending()}")
}