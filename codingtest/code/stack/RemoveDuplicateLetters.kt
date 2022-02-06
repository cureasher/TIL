package stack

import java.util.*
import kotlin.collections.HashSet

fun removeDuplicateLetters(words: String):String {
    var stack = Stack<Char>()
    var check = HashSet<Char>()
    var charCount = IntArray(26)
    for (word in words) {
        charCount[word - 'a']++
    }

    for (word in words) {
        if(check.contains(word)){
            charCount[word - 'a']--
            continue
        }
        while (!stack.isEmpty() && stack.peek() > word && charCount[stack.peek() -'a'] > 0){
            check.remove(stack.pop())
        }
        stack.add(word)
        check.add(word)
        charCount[word - 'a']--
    }
    return stack.joinToString("")
}

fun main() {
    println(removeDuplicateLetters("bcabc"))
    println(removeDuplicateLetters("cbacdcbc"))
}