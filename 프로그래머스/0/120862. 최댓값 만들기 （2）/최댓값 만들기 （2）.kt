class Solution {
    fun solution(numbers: IntArray): Int {
        val nums = numbers.sorted()
        val x = nums.size
        
        return maxOf(nums[0] * nums[1], nums[x - 1] * nums[x - 2])
    }
}