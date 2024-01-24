class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var numer: Int
        var denom: Int
        
        if (denom1 == denom2) {
            numer = numer1 + numer2
            denom = denom1
        } else {
                numer = numer1 * denom2 + numer2 * denom1
                denom = denom1 * denom2
        }
        
        // 최대 공약수
        val gcdValue = gcd(numer, denom)
        
        // 기약분수 만들기
        numer /= gcdValue
        denom /= gcdValue
        
        return intArrayOf(numer, denom)
    }
    
    // 최대 공약수 계산
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}