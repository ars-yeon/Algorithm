class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        val arr = (0 until my_string.length)
                        .map { my_string.substring(it) }
                        .toTypedArray()
                        
        return if (is_suffix in arr) 1 else 0
    }
}