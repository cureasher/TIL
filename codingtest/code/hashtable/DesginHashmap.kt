package hashtable

class MyHashMap() {
    private var hashSize  = 1000
    private val hashMap = arrayOfNulls<Int>(hashSize)

    private fun calcHash(key:Int): Int = key % hashSize
    
    fun put(key: Int, value: Int) {
        hashMap[calcHash(key)] = value
    }

    fun get(key: Int): Int {
        return hashMap[calcHash(key)] ?: -1
    }

    fun remove(key: Int) {
        hashMap[calcHash(key)] = null
    }
}

fun main() {
    var myHashMap = MyHashMap()
    myHashMap.put(1,1)
    myHashMap.put(2,2)
    println(myHashMap.get(1))
    println(myHashMap.get(3))
    myHashMap.put(2,1)
    println(myHashMap.get(2))
    myHashMap.remove(2)
    println(myHashMap.get(2))
}