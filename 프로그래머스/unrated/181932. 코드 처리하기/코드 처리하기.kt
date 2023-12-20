class Solution {
    fun solution(code: String): String {
        var answer = StringBuilder()
        var mode = 0
        
        for ((idx, char) in code.withIndex()) {
            when {
                (mode == 0 && char != '1' && idx % 2 == 0) || (mode == 1 && char != '1' && idx % 2 != 0) -> answer.append(char)
                char == '1' -> mode = 1 - mode
            }
        }
        return if (answer.isEmpty()) "EMPTY" else answer.toString()
    }
}