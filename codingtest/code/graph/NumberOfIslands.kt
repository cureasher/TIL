package graph

fun dfs(grid: Array<CharArray>, x: Int, y: Int) {
    if (x >= 0 && y >= 0 && x < grid.size && y < grid[0].size && grid[x][y] == '1') {
        grid[x][y] = '0'
        dfs(grid, x - 1, y)
        dfs(grid, x + 1, y)
        dfs(grid, x, y - 1)
        dfs(grid, x, y + 1)
    }
}

fun numIslands(grid: Array<CharArray>): Int {
    var islandsCount = 0
    grid.indices.forEach { x ->
        grid[x].indices.forEach { y ->
            if (grid[x][y] == '1') {
                dfs(grid, x, y)
                islandsCount++
            }
        }
    }
    return islandsCount
}

fun main() {
    val grid = arrayOf(charArrayOf('1','1','1','1','0'),
            charArrayOf('1','1','0','1','0'),
            charArrayOf('1','1','0','0','0'),
            charArrayOf('0','0','0','0','0'))
    println(numIslands(grid))
}