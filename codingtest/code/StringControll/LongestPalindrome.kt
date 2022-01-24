fun longestPalindrome(words: String): String {
    var longest: String = ""

    fun palindromeCheck(start: Int, end: Int) {
        var first = start
        var last = end
        while (first >= 0 && last < words.length) {
            if (words[first] != words[last]) break
            if (last - first + 1 > longest.length)
                longest = words.slice(IntRange(first, last))
            first--
            last++
        }
    }

    for (index in words.indices) {
        palindromeCheck(index, index)
        palindromeCheck(index, index + 1)
    }

    return longest
}