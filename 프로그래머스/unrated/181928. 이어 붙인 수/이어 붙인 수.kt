class Solution {
    fun solution(num_list: IntArray): Int {
        val odd = num_list.filter { it % 2 != 0 }.joinToString("").toIntOrNull() ?: 0
        val even = num_list.filter { it % 2 == 0 }.joinToString("").toIntOrNull() ?: 0
        return odd + even
    }
}