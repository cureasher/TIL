fun arrayPairSum(numbers:IntArray): Int {
    return numbers.sorted().windowed(2, 2).map { Math.min(it[0], it[1]) }.sum()
}