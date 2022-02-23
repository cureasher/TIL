package graph

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


fun findItinerary(tickets: List<List<String>>): List<String> {
    val scheduleList = ArrayList<String>()
    val scheduleMap = HashMap<String, PriorityQueue<String>>()

    fun scheduleGraph() {
        tickets.forEach { ticket ->
            scheduleMap.getOrPut(ticket[0], { PriorityQueue() }).offer(ticket[1])
        }
    }

    fun dfs(departure: String) {
        while (scheduleMap.contains(departure) && !scheduleMap[departure]!!.isEmpty()) {
            dfs(scheduleMap[departure]!!.poll())
        }
        scheduleList.add(departure)
    }

    scheduleGraph()

    dfs("JFK")

    return scheduleList.reversed()
}

fun main() {
    println(findItinerary(listOf(listOf("MUC","LHR"),
            listOf("JFK","MUC"),
            listOf("SFO","SJC"),
            listOf("LHR","SFO"))))
}