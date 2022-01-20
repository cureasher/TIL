fun reorderLogFiles(logs: Array<String>): List<String> {
    val logLines = logs.map {fullLog ->
        fullLog.substringAfter(' ') to fullLog
    }

    val (letterLogs, digitLogs) = logLines.partition { !it.first[0].isDigit() }

    val letterLogsSort = letterLogs.sortedWith(compareBy({ it.first }, { it.second }))

    return (letterLogsSort.map { it.second }.plus(digitLogs.map { it.second }))
}