class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        val arr = my_string.toCharArray()
        for (query in queries) {
            for (i in query[0] until (query[0] + query[1] + 1) / 2) {
                arr[i] = arr[query[0] + query[1] - i].also { arr[query[0] + query[1] - i] = arr[i] }
            }
        }
        return String(arr)
    }
}