fun productExceptSelf(numbers: IntArray): IntArray {
    val elementMultiple = IntArray(numbers.size) { 1 }
    val numbersLength = numbers.size - 1

    var start: Int = 1
    var end: Int = 1

    for (index in numbers.indices) {
        elementMultiple[index] *= start
        elementMultiple[numbersLength - index] *= end

        start *= numbers[index]
        end *= numbers[numbersLength - index]
    }

    return elementMultiple
}