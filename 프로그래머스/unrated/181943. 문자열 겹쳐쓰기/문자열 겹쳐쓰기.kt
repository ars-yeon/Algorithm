class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        val before = my_string.substring(0, s)
        val after = my_string.substring(s + overwrite_string.length)
        return before + overwrite_string + after
    }
}