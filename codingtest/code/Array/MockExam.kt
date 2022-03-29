package array

fun mockExam(answers: IntArray): IntArray {
    val studentAnswers = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))
    val studentCount = IntArray(3)
    val studentTestResult = mutableListOf<Int>()
    studentAnswers.forEachIndexed { index, testAnswer ->
        studentCount[index] = answers.filterIndexed { studentIndex, answer -> 
            answer == testAnswer[studentIndex % testAnswer.size] }.count()
    }
    studentCount.forEachIndexed { index, students ->
        if (studentCount.maxOrNull() == students)
            studentTestResult.add(index + 1) }
    return studentTestResult.toIntArray()
}

fun main() {
    println(mockExam(intArrayOf(1,2,3,4,5)).toList())
    println(mockExam(intArrayOf(1,3,2,4,2)).toList())
}