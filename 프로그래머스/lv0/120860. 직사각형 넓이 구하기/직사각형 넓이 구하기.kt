class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val x = dots.map{it[0]}
        val y = dots.map{it[1]}
        val w = (x.maxOrNull() ?: 0)-(x.minOrNull() ?: 0)
        val h = (y.maxOrNull() ?: 0)-(y.minOrNull() ?: 0)
        return w*h
    }
}