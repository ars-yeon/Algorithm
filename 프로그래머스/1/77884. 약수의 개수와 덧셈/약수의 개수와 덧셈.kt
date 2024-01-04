class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        // 제곱인 수는 약수가 홀수이므로 제곱을 했을때 1000 이하인 1부터 32까지의 제곱수를 가지는 리스트 생성
        val nums = (1..32).map { it * it }
        
        // left부터 right까지의 모든 수에 대해 반복
        for (i in left..right) {
            // 만약 i가 nums 리스트에 포함되어 있으면 -i를 더하고, 아니면 i를 더함
            answer += if (i in nums) -i else i
        }
        
        return answer
    }
}