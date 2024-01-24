class Solution {
    fun solution(hp: Int): Int {
        var hpLeft = hp
        val powers = listOf(5, 3, 1)
        var cnt = 0
    
        for (power in powers) {
            cnt += hpLeft / power 
            hpLeft %= power
        }
        return cnt
    }
}