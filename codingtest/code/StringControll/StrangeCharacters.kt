package string

fun strangeCharacters(words: String) : String = words.split(" ").joinToString(" ") { changeWords ->
    changeWords.mapIndexed { index, word ->
        if (index % 2 == 0) word.toUpperCase() else word.toLowerCase()
    }.joinToString("")
}

fun main() {
    println(strangeCharacters("try hello world"))
}s