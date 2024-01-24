class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer = StringBuilder()
        
        for (i in cipher.indices) {
            if ((i + 1) % code == 0) {
                answer.append(cipher[i])
            }
        }
        
        return answer.toString()
    }
}