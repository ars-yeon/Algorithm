class Solution {
    fun solution(my_string: String): Array<String> =
        (0 until my_string.length)
            .map { my_string.substring(it) }
            .sorted()
            .toTypedArray()
}