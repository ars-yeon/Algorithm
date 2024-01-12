class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0
        
        fun dfs(index: Int = 0, result: Int = 0) {
            // 배열의 끝에 도달한 경우
            if (index == numbers.size) {
                // 현재까지의 합이 타겟과 일치하면
                if (result == target) {
                    // 경우의 수 증가
                    answer ++
                }
            } else {
                // 현재 숫자를 더하는 경우의 재귀 호출
                dfs(index + 1, result + numbers[index])
                // 현재 숫자를 빼는 경우의 재귀 호출
                dfs(index + 1, result - numbers[index])
            }
        }
        
        dfs()
        return answer
    }
}