class Solution {
    fun solution(numLog: IntArray): String {
        var answer = ""
        var num = 0

        for (i in numLog.indices) {
            val diff = if (i > 0) numLog[i] - numLog[i - 1] else numLog[i]

            if (diff == 1) answer += "w"
            else if (diff == -1) answer += "s"
            else if (diff == 10) answer += "d"
            else if (diff == -10) answer += "a"

            num += diff
        }

        return answer
    }
}