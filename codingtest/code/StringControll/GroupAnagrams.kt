fun groupAnagrams(words: Array<String>): List<List<String>> {
    return words.groupBy {word -> word.toCharArray().sorted().toString() }.values.toList()
}