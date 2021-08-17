package code.four

fun main(args: Array<String>) {
    val naverURL: CharSequence = "https://www.naver.com"

    println(naverURL.startsWith("https://"))
    println(naverURL.endsWith(".com"))
    println(naverURL.removePrefix("https://"))
    println(naverURL.removeSurrounding("https://",".com"))

}