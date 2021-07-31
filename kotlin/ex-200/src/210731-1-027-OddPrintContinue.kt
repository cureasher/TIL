package code

fun main(args: Array<String>) : Unit {
    var Odd = 0
    while (Odd < 10){
        Odd++
        if(Odd % 2 == 0)
            continue // 짝수일 경우 아래의 문장을 건너 뜀
        print(Odd)
    }
}