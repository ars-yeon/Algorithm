class Solution {
    fun solution(num: Int, total: Int): IntArray = (total/num - (num-1)/2).let{it -> IntArray(num) {index -> index+it}}
}