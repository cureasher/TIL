package code.second

fun String.isNumber(): Boolean{
    var i = 0
    while ( i < this.length){
        // 0~9 숫자가 하나도 없으면 false 반환
        if (!('0'<=this[i] && this[i] <= '9'))
            return false
        i++
    }
    // 모두 숫자면 true 반환
    return true
}

fun main(args: Array<String>) {
    println("1234567890".isNumber())
    println("500원".isNumber())
}