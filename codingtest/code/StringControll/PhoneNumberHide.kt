package string

fun phoneNumberHide(phone_number: String): String = "${"".padStart(phone_number.length - 4, '*')}${phone_number.takeLast(4)}"
fun main() {
    println(phoneNumberHide("01033334444"))
    println(phoneNumberHide("027778888"))
}