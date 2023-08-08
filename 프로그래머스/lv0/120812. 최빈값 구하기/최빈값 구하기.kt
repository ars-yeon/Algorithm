class Solution {
    fun solution(array: IntArray): Int {
        val freqMap = mutableMapOf<Int, Int>()
        for (n in array) {
            freqMap[n] = freqMap.getOrDefault(n, 0) + 1
        }
        val maxFreq = freqMap.values.maxOrNull() ?: 0
        val modeVal = freqMap.filterValues { it == maxFreq }.keys
        return if (modeVal.size > 1) -1 else modeVal.first()
    }
}