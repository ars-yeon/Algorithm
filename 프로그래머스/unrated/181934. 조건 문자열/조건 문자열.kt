class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int = when {
        (ineq == "<" && n <= m) || (ineq == ">" && n >= m) && eq == "=" -> 1
        (ineq == "<" && n < m) || (ineq == ">" && n > m) && eq == "!" -> 1
        else -> 0
    }
}