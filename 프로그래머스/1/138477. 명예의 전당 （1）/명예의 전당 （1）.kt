class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        // 상위 k개의 점수를 오름차순으로 저장하는 리스트
        var topK = mutableListOf<Int>()
        
        for (s in score) {
            // 명예의 전당이 아직 k개의 점수를 가지지 않은 경우
            if (topK.size < k) {
                topK += s // 현재 가수의 점수를 추가
            } else if (topK[0] < s) {
                topK[0] = s // 현재 가수의 점수가 명예의 전당에 있는 가장 낮은 점수보다 높으면 업데이트
            }
            
            topK.sort() // 명예의 전당 리스트를 오름차순으로 정렬
            answer += topK[0] // 현재 날짜까지의 명예의 전당 최하위 점수를 결과 리스트에 추가
        }
        return answer
    }
}