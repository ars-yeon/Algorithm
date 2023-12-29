class Solution {
    fun solution(num_list: IntArray): IntArray {
        val odd = num_list.count { it % 2 == 0 }
        return intArrayOf(odd, num_list.size - odd)
    }
}