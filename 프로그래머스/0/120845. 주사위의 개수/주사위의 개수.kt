class Solution {
    fun solution(box: IntArray, n: Int): Int {
        val w = box[0] / n
        val l = box[1] / n
        val h = box[2] / n
        
        return w * l * h
    }
}