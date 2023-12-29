class Solution {
    fun solution(n: Int): Int {
        return (1..n/2).count { n % it == 0 } + 1
    }
}