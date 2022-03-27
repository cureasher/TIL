package array

fun solution(month: Int, day: Int): String {
    val dayOfWeek = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
    val monthLastDay = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val dayTotal = (0 until month - 1).map { daySum -> monthLastDay[daySum] }.sum() + day

    return dayOfWeek[dayTotal % 7]
}

fun main() {
    println(solution(5,24))
}