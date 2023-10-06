class Solution {
    fun solution(my_string: String, k: Int): String {
        return List(k) { my_string }.joinToString("")
    }
}