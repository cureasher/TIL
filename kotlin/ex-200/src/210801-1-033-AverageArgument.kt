package code

fun main(args: Array<String>) {
    // 인수를 입력 안해도 디폴트 인수 적용 됨
    println(getAverage())
    println(getAverage(89, 96))
    getAverage(100,50, true)
    println(getAverage(90))
    getAverage(66, trueAndFalse=true)
    getAverage(trueAndFalse=true)  //
    getAverage(trueAndFalse=true, korean=10, english=30)
}
// 디폴트 인수 사용시 타입 지정 필요
fun getAverage(korean : Int = 0, english: Int = 0, trueAndFalse : Boolean = false) : Double{
    val averageScore = (korean + english) / 2.0
    if(trueAndFalse)
        println(averageScore)
    return averageScore
}