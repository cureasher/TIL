fun validPalindrome(words:String): Boolean{
    var word = words.toLowerCase()
    val reg = "[^a-z0-9]".toRegex()
    val w = word.replace(reg, "")

    return w == w.reversed()
}