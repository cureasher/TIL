fun mostCommonWord(paragraph: String, banned: Array<String>) = mutableMapOf<String, Int>().apply {
    paragraph.toLowerCase().replace(Regex("[^\\w]"), " ").split(" ")
            .filter { !banned.contains(it) && it.isNotBlank() }
            .forEach { this[it] = getOrDefault(it, 0) + 1 }
}.maxBy { it.value }?.key!!