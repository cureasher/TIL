package hashtable

fun lengthOfLongestSubstring(words: String): Int{
    if (words == null || words.length == 0) return 0
    var usedWord = ""
    var maxLength = 0

    words.forEach{ char ->
        usedWord = if (usedWord.contains(char)) usedWord.substringAfterLast(char) + char else usedWord + char
        maxLength = maxOf(maxLength, usedWord.length)
    }
    return maxLength
}

fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
}