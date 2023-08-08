class Solution {
    fun solution(my_string: String): IntArray {
        val nums = my_string.filter{it.isDigit()}.map{it.toString().toInt()}.sorted()
        return nums.toIntArray()
    }
}
