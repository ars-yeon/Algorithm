class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        var sum = 0
        // 각 귤의 크기별 개수를 담은 리스트, 내림차순 정렬
        val tangerineCnt = tangerine.groupBy { it }
            .mapValues { it.value.size }
            .values
            .sortedDescending()

        for (cnt in tangerineCnt) {
            sum += cnt // 개수를 누적하여 더함
            answer++ // 귤의 종류를 하나씩 증가
            if (sum >= k) break // 누적된 개수가 목표 개수 k를 넘으면 반복 종료
        }

        return answer
    }
}