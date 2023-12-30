class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        return queries.map { (s, e, k) ->
            val result = arr.slice(s..e).filter { it > k }.minOrNull()
            result ?: -1
        }.toIntArray()
    }
}