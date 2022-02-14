package hashtable

fun numJewelsInStones(jewels: String, stone :String) : Int{
    return stone.filter { jewelsCount -> jewels.toSet().contains(jewelsCount) }.length
}

fun main() {
    println(numJewelsInStones(jewels = "aA", stone = "aAAbbbb"))
}