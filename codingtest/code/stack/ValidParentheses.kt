package stack

import java.util.*

fun isValid(parentheses: String): Boolean {
    if(parentheses.length % 2 != 0) return false
    val stack = Stack<Char>()
    parentheses.reversed().forEach { bracket ->
        when (bracket) {
            '(' -> if (stack.peek() == ')') stack.pop() else stack.push(bracket)
            '[' -> if (stack.peek() == ']') stack.pop() else stack.push(bracket)
            '{' -> if (stack.peek() == '}') stack.pop() else stack.push(bracket)
            else -> stack.push(bracket)
        }
    }

    return stack.isEmpty()
}

fun main() {
    println(isValid("(){}[]"))
}