package code.four

fun IntProgression.print(){
    print("first: ${this.first}, ")
    print("last: ${this.last}, ")
    println("step: ${this.step}")

    for (i in this)
        print("$i")
    println()
}

fun main(args: Array<String>) {
    val sevenToThree: IntProgression = 7 downTo 3
    sevenToThree.print()

    val threeTosevenReverse: IntProgression = (3..7).reversed()
    println("sevenToThree == threeTosevenReverse: ${sevenToThree == threeTosevenReverse}")
    threeTosevenReverse.print()

    val oneToTenThreeStep: IntProgression = (1..10)step 3
    oneToTenThreeStep.print()

    val tenToTwoThreeStep: IntProgression = 10 downTo 2 step 3
    tenToTwoThreeStep.print()

    val twoToFour: IntProgression = 2 until 5
    twoToFour.print()
}