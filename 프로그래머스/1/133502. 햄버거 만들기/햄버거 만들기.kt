class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val hamburger = StringBuilder()
        
        for (item in ingredient) {
            // ingredient의 요소인 item을 문자열로 변환하여 hamburger에 추가함
            hamburger.append(item.toString())
            // hamburger의 길이가 4 이상이고, 마지막 4자리가 "1231"인 경우
            if (hamburger.length >= 4 && hamburger.substring(hamburger.length - 4) == "1231") {
                // hamburger의 길이를 4만큼 감소시켜 마지막 4자리(1231)을 제외함
                hamburger.setLength(hamburger.length - 4)
                // 햄버거 하나가 완성되었으므로 answer에 +1
                answer++
            }
        }
        return answer
    }
}