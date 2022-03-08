package string

fun solution(sentence : String, shift : Int) : String {
    return sentence.map { alphabet ->
        when(alphabet) {
            in 'a'..'z' -> 'a' + ((alphabet - 'a' + shift) % 26)
            in 'A'..'Z' -> 'A' + ((alphabet - 'A' + shift) % 26)
            else -> alphabet
        }
    }.joinToString("")
}

fun main() {
    println(solution("AB",1))
    println(solution("z",1))
    println(solution("a B z",2))
}