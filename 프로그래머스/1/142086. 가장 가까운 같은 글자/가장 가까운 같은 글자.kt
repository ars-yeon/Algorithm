class Solution {
    fun solution(s: String): IntArray {
        val answer = mutableListOf<Int>()
        
        val words = s.toCharArray()
        for (i in words.indices) {
            val temp = words.sliceArray(0 until i)
            val last = temp.lastIndexOf(words[i])
            
            if (last == -1) {
                // 현재 문자 이전에 같은 글자가 없으면, -1 추가
                answer.add(-1)
            } else {
                // 현재 문자 이전에 같은 글자가 있다면,
                // 가장 가까운 문자와의 거리를 계산하여 추가
                answer.add(i - last)
            }
        }
        return answer.toIntArray()
    }
}
