fun threeSum(numbers: IntArray) : List<List<Int>>{
    var results = HashSet<List<Int>>()
    if (numbers.size <= 2){
        return results.toList()
    }
    numbers.sort()
    for (index in 0 until numbers.size - 2){
        var left = index + 1
        var right = numbers.size - 1

        while(left < right){
            var sum = numbers[index] + numbers[left] + numbers[right]

            when {
                sum == 0 -> {
                    results.add(listOf(numbers[index], numbers[left], numbers[right]))
                    left++
                    right--
                }
                sum < 0 -> left++
                else -> right--
            }
        }
    }
    return results.toList()
}