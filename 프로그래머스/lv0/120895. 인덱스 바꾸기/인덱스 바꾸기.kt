class Solution {
    fun solution(str: String, n1: Int, n2: Int): String {
        val list = str.toCharArray()
        val temp = list[n1]
        list[n1] = list[n2]
        list[n2] = temp
        return list.joinToString("")
    }
}