class Solution {
    fun solution(numList: IntArray): IntArray {
        if (numList.size < 2) return numList

        val last = numList.last()
        val prev = numList[numList.size - 2]

        val result = if (last > prev) last - prev else last * 2

        return numList.plus(result)
    }
}