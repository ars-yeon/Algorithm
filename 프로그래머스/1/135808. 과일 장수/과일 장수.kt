class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        return score.sortedDescending()
            .take(score.size - score.size % m)
            .chunked(m)
            .sumBy { box ->
                box.minOrNull()!! * m
            }
    }
}