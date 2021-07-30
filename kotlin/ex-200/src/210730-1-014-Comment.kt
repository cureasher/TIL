package code

fun main(args: Array<String>) : Unit {
    // Apple을 화면에 출력한다.
    println(/* 이 부분은 컴파일러가 통째로 무시한다. */ "Apple"
        /*이
            부
            분
            도*/
    )

    val a = 15
    val b = a+5 / 3.0

    // 테스트로 b에 값이 저장되어 있는지 확인하기 위해 b값 출력
    // println(b)

    println(a * b) // 최종 결과 출력

}