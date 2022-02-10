package queue

class MyCircularQueue(circleLength: Int) {
    var queue = IntArray(circleLength)
    var maxSize = circleLength

    var circleQueueFront = 0
    var circleQueueRear = 0
    var queueSize = 0
    
    fun enQueue(value: Int): Boolean {
        if (isFull()) return false

        queue[circleQueueFront] = value
        circleQueueFront = (circleQueueFront + 1) % maxSize
        queueSize++
        return true
    }

    fun deQueue(): Boolean {
        if (isEmpty()) return false

        circleQueueRear = (circleQueueRear + 1) % maxSize
        queueSize--
        return true
    }

    fun Front(): Int {
        if (isEmpty()) return -1
        return queue[circleQueueRear]
    }

    fun Rear(): Int {
        if (isEmpty()) return -1

        val lastIndex = (circleQueueFront - 1).let {
            if (it < 0) it + maxSize
            else it
        }
        return queue[lastIndex]
    }

    fun isEmpty(): Boolean {
        return queueSize == 0
    }

    fun isFull(): Boolean {
        return queueSize == maxSize
    }
}


fun main() {
    var circleQueue = MyCircularQueue(5)
    println(circleQueue.enQueue(10))
    println(circleQueue.enQueue(20))
    println(circleQueue.enQueue(30))
    println(circleQueue.enQueue(40))
    println(circleQueue.Rear())
    println(circleQueue.isFull())
    println(circleQueue.deQueue())
    println(circleQueue.deQueue())
    println(circleQueue.enQueue(50))
    println(circleQueue.enQueue(60))
    println(circleQueue.Rear())
    println(circleQueue.Front())
}
