package code

fun main(args: Array<String>) : Unit{

    val score = 88

    if (score >= 90){
        println("A")
    } else if(score >= 80){
        println("B")
    } else if(score >= 70){
        println("C")
    } else if(score >= 60) {
        println("D")
    } else if(score >= 50) {
        println("E")
    } else {
        println("F")
    }
}