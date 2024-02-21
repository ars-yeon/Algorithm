class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        return buildString {
            index_list.forEach { idx ->
                append(my_string[idx])
            }
        }
    }
}