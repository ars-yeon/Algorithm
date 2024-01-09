class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        // 이용료 * (1~count 합) - 갖고 있는 돈
        return maxOf(0L, price * (count + 1L) * count / 2 - money)
    }
}