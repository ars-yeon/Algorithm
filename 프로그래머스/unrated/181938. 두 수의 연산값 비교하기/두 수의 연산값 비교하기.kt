class Solution {
    fun solution(a: Int, b: Int): Int = maxOf(a*b*2, (a.toString() + b.toString()).toInt()) 
}