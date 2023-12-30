class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for ((i, j) in queries) {
            arr[i] = arr[j].also { arr[j] = arr[i] }
        }
        return arr
    }
}