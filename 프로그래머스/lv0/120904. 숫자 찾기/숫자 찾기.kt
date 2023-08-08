class Solution {
    fun solution(num: Int, k: Int): Int {
        val nums = num.toString()
        val n = k.toString()
        var r = 0
        if(nums.contains(n)){r += nums.indexOf(n)+1}
        else {r = -1}
        return r
    }
}