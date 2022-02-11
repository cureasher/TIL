package deque

class MyCircularDeque(val dequeSize: Int){
    var head = Node(-1)
    var tail = Node(-1)
    var count = 0

    init {
        head.next = tail
        tail.pre = head
    }

    fun insertFront(value: Int): Boolean {
        if (isFull()) return false
        val node = Node(value)
        val next = head.next
        head.next = Node(value)
        node.next = next
        node.pre = head
        next?.pre = node
        count++
        return true
    }

    fun insertLast(value: Int): Boolean {
        if (isFull()) return false
        val node = Node(value)
        val pre = tail.pre
        pre?.next = node
        node.next = tail
        tail.pre = node
        node.pre = pre
        count++
        return true
    }

    fun deleteFront(): Boolean {
        if (count == 0) return false
        val nextNext = head.next?.next
        head.next = nextNext
        nextNext?.pre = head
        count--
        return true
    }

    fun deleteLast(): Boolean {
        if (isEmpty()) return false
        val prePre = tail.pre?.pre
        prePre?.next = tail
        tail.pre = prePre
        count--
        return true
    }

    fun getFront(): Int {
        if (isEmpty()) return -1
        return head.next?.value ?: -1
    }

    fun getRear(): Int {
        if (isEmpty()) return -1
        return tail.pre?.value ?: -1
    }

    fun isEmpty(): Boolean {
        return count == 0
    }

    fun isFull(): Boolean {
        return count == dequeSize
    }
}

class Node(val value: Int){
    var next : Node? = null
    var pre : Node? = null
}

fun main() {
    var myCircularDeque = MyCircularDeque(3)
    println(myCircularDeque.insertLast(1))
    println(myCircularDeque.insertLast(2))
    println(myCircularDeque.insertFront(3))
    println(myCircularDeque.insertFront(4))
    println(myCircularDeque.getRear())
    println(myCircularDeque.isFull())
    println(myCircularDeque.deleteLast())
    println(myCircularDeque.insertFront(4))
    println(myCircularDeque.getFront())
}