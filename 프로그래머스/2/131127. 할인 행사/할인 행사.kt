class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        // 각 제품과 해당 수량을 저장할 맵
        val map = mutableMapOf<String, Int>()

        // 원하는 제품과 해당 수량을 맵에 저장
        want.forEachIndexed { index, s ->
            // want 배열에 있는 각 제품에 해당하는 수량 저장
            map[s] = number[index]
        }

        // 회원 가입 가능한 경우를 세기 위한 변수
        var count = 0
        // 할인하는 날짜를 10일씩 기준으로 순회
        for(i in 0..discount.size - 10){
            // 현재 기준일로부터 10일 동안의 할인 상태를 저장할 복사본 맵
            val copy = map.toMutableMap()
            
            // 현재 기준일부터 10일 동안의 할인 상태 반영
            for(j in 0 until 10 ){
                // 할인 받은 제품에 해당하는 수량 감소
                copy[discount[i+j]] = copy[discount[i+j]]?.minus(1)?:-1
            }
            // 모든 제품의 수량이 0이 되었으면 회원 가입 가능한 경우이므로 count 증가
            if(copy.all { it.value === 0 }) count++
        }
        return count
    }
}