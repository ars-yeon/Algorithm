class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int = included.mapIndexed { idx, include -> if (include) a+idx*d else 0 }.sum()
}