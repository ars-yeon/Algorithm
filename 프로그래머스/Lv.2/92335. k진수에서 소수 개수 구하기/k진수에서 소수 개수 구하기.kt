class Solution {
    fun toKBase(n: Int, k: Int): String {
        // n을 k진수로 변환
        return n.toString(k)
    }
    
    fun isPrime(n: Long): Boolean {
        // 2 미만의 수는 소수가 아님
        if (n < 2) return false
        
        // 2부터 제곱근까지의 수로 나누어 소수 여부 확인
        for (i in 2..Math.sqrt(n.toDouble()).toLong()) {
            if (n % i == 0L) return false
        }
        return true
    }
    
    fun countPrimes(n: Int, k: Int): Int {
        val kBaseNum = toKBase(n, k)
        val segments = kBaseNum.split("0")
        return segments.count { it.isNotEmpty() && isPrime(it.toLong()) }
    }
    
    fun solution(n: Int, k: Int): Int {
        return countPrimes(n, k)
    }
}