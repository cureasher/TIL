package code.second

fun main(args: Array<String>) {
    var one = "one"
    var otherOne = "one"

    // 서로 가리키는 객체가 같으므로 true
    println(one === otherOne)

    otherOne = "on"
    otherOne += "e"
    // 서로 가리키는 객체가 다르므로 true
    println(one !== otherOne)

    otherOne = one
    // 서로 가리키는 객체가 같으므로 true
    println(one === otherOne)
}