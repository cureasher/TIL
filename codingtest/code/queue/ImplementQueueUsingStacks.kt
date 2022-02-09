package queue

import kotlin.collections.ArrayDeque

class MyQueue{
    var stack = ArrayDeque<Int>()

    fun push(x : Int){
        stack.add(x)
    }

    fun pop() : Int {
        return stack.removeFirst()
    }

    fun peek(): Int{
        return stack.first()
    }

    fun empty() : Boolean{
        return stack.isEmpty()
    }
}

fun main() {
    var stack = MyQueue()
    stack.push(1)
    stack.push(2)
    println(stack.peek())
    println(stack.pop())
    println(stack.empty())
}