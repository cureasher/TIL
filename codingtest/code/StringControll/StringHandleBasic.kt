package string

fun StringHandleBasic(s: String) = (s.length == 4 || s.length == 6) && s.toIntOrNull() != null

fun main() {
    println(StringHandleBasic("a234"))
    println(StringHandleBasic("1234"))
}