class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        val nums = (1..32).map { it * it }
        
        for (i in left..right) {
            answer += if (i in nums) -i else i
        }
        
        return answer
    }
}