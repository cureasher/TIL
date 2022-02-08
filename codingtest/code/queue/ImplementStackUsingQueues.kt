package queue

import java.util.*

class MyStack{
    var queue = ArrayDeque<Int>()

    fun push(x : Int){
        var size = queue.size
        queue.add(x)

        for (index in 0 until size){
            queue.add(queue.poll())
        }
    }

    fun pop() : Int {
        return queue.pop()
    }

    fun top() : Int {
        return queue.peek()
    }

    fun empty() : Boolean {
        return queue.isEmpty()
    }
}

fun main() {
    var queue = MyStack()
    queue.push(1)
    queue.push(2)
    println(queue.top())
    println(queue.pop())
    println(queue.empty())
}