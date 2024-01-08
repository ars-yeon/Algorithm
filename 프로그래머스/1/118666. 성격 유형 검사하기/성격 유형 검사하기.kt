class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        
        var person: CharArray = charArrayOf('R', 'T', 'C', 'F', 'J', 'M', 'A', 'N')
        var score: IntArray = IntArray(8) { 0 }
        
        // 각 질문에 대한 성격 유형 점수 계산
        for (i in survey.indices) {
            // survey[i][1]은 현재 질문에서 동의 관련 선택지에 해당하는 성격 유형
            // choices[i] - 4를 통해 선택지에 따른 점수를 계산하여 해당 성격 유형에 더함
            score[person.indexOf(survey[i][1])] += choices[i]-4
        }
        
        // 성격 유형 판단
        for (i in 0..7 step 2) {
            // score[i]와 score[i+1]을 비교하여 높은 점수를 가진 성격 유형을 answer에 추가
            if (score[i] >= score[i+1]) answer += person[i]
            else answer += person[i+1]
        }
        
        return answer
    }
}