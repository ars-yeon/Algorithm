class Solution {
    fun solution(n_list: IntArray, n: Int): Array<IntArray> {
        val rows = n_list.size / n
        var res = Array(rows){IntArray(n)}
       	
        for (i in 0 until rows) {
            for (j in 0 until n) {
                res[i][j] = n_list[i * n + j]
            }
        }
        return res
    }
}