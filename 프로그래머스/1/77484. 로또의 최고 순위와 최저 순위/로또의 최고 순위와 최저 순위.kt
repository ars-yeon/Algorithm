class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        // 플레이어가 맞춘 번호의 개수
        val correctCnt = win_nums.count { it in lottos }
        // 0을 포함하여 플레이어의 맞춘 번호의 개수
        val totalCnt = correctCnt + lottos.count { it == 0 }
        // 로또 순위 (key: 일치하는 숫자의 개수, value: 순위)
        val rank = mapOf(2 to 5, 3 to 4, 4 to 3, 5 to 2, 6 to 1)
        // 최고 순위, 최저순위에 해당하는 
        val answer = intArrayOf(totalCnt, correctCnt).map { rank.getOrDefault(it, 6) }
        
        return answer.toIntArray()
    }
}