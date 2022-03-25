package math

fun solution(price: Int, money: Int, count: Int): Long {
    return Math.max(count * (price + price * count) / 2L - money, 0)
}

fun main() {
    println(solution(3, 20, 4))
}