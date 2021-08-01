package code

// 최대값 반환 함수
fun max(number1: Int, number2: Int) : Int = if(number1 > number2) number1 else number2

// 최소값 반환 함수
fun min(number1: Int, number2: Int) : Int = if(number1 < number2) number1 else number2

// 절대값 반환 함수
fun abs(number: Int) : Int = if(number >= 0) number else -number