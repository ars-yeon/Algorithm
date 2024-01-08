class Solution {
    fun solution(n: Int): Int {
        // 3진법 문자열로 변환 -> 문자열 뒤집기 -> 3진법 문자열을 10진법으로 변환
        return n.toString(3)
                .reversed()
                .toInt(3)
    }
}