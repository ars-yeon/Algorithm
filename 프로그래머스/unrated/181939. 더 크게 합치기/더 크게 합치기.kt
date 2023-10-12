class Solution {
    fun solution(a: Int, b: Int): Int {
        val ab = a.toString() + b.toString()
        val ba = b.toString() + a.toString()
        return maxOf(ab.toInt(), ba.toInt())
    }
}