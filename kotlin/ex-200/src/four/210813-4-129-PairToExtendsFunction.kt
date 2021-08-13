package code.four

infix fun <FirstInt, SecondDouble> FirstInt.to(that: SecondDouble): Pair<FirstInt, SecondDouble>
        = Pair(this, that)

fun main(args: Array<String>) {
    val test: Pair<Int, Double> = 10 to 3.14
    println("Pair객체: $test")
}