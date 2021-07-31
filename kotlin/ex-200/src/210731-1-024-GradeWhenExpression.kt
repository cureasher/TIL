package code

fun main(args: Array<String>) : Unit {

    val score = 85

    val grade:Char = when(score / 10){
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9,10 -> 'A'
        else -> 'F'
    }
    print("grade의 성적 : ")
    println(grade)

    val grade2:Char = when{
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else -> 'F'
    }
    print("grade2의 성적 : ")
    println(grade2)

}