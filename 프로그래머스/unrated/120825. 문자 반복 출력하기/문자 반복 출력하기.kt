class Solution {
    fun solution(my_string: String, n: Int): String {
        return my_string.map { c -> c.toString().repeat(n) }.joinToString("") 
    }
}