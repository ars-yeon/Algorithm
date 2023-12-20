class Solution {
    fun solution(num_list: IntArray): Int {
        val product = num_list.reduce(Int::times)
        val sum = num_list.sum()
        return if (product < sum * sum) 1 else 0
    }
}