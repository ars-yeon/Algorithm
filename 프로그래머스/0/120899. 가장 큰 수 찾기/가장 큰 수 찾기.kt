class Solution {
    fun solution(array: IntArray): IntArray {
        val maxIdx = array.indexOf(array.maxOrNull() ?: 0)

        return intArrayOf(array[maxIdx], maxIdx)
    }
}