class Solution {
    fun solution(num: Int, n: Int, m: Int): Int = if ((num % n) == 0 && (num % m) == 0) 1 else 0
}