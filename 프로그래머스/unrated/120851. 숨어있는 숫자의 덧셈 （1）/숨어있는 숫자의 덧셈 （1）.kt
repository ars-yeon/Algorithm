class Solution {
    fun solution(my_string: String): Int {
        val s = my_string.replace("[^0-9]".toRegex(), "")
        
        if (s.isNotEmpty()) {
            return s.map { it.toString().toInt() }.sum()
        }
        
        return 0
    }
}