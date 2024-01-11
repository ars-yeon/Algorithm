class Solution {
    fun solution(n: Int): Long {
        if (n == 1) return 1
        
        var (prev, current) = 1L to 1L
        
        for (i in 2..n) {
            val temp = current
            current = (prev + current) % 1234567
            prev = temp
        }
        return current
    }
}