fun twoSum(numbers: IntArray, target: Int) : IntArray{
    val numbersMap : MutableMap<Int, Int> = mutableMapOf()

    for ((index, number) in numbers.withIndex()){
        val targetCheck = target-number
        if(numbersMap.containsKey(targetCheck))
            return intArrayOf(numbersMap[targetCheck]!!, index)
        numbersMap[number] = index
    }
    return intArrayOf(-1, -1)
}