class Solution {
    fun solution(my_string: String, n: Int): String {
        val l = my_string.length
        return my_string.substring(l - n until l)
    }
}