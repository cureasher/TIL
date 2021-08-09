package code.third

class IntDoublePair<A,B>(val first: A, val second: B){
    override fun toString() = "$first\n$second"
}

fun main(args: Array<String>) {
    val pair: IntDoublePair<Int, Double>
    pair = IntDoublePair<Int, Double>(15, 9.12)
    println(pair.toString())
}