class Solution {
    fun solution(n: Int): Int {
        var sqrtN = Math.sqrt(n.toDouble()).toInt()
        return if ( sqrtN * sqrtN == n) 1 else 2
    }
}