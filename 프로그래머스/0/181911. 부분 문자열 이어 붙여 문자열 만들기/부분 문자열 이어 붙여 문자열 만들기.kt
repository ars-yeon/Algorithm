class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer = StringBuilder()
        for (i in my_strings.indices) {
            answer.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1))
        }
        return answer.toString()
    }
}