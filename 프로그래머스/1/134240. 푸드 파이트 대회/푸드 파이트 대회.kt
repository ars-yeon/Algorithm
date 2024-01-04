class Solution {
    fun solution(food: IntArray): String {
        val foodList = mutableListOf<Int>()

        // food 배열의 두 번째부터 끝까지를 가져와서 각 원소를 2로 나눈 뒤 인덱스와 함께 매핑
        for ((idx, cnt) in food.slice(1 until food.size).map { it / 2 }.withIndex()) {
            // foodList에 현재 인덱스에 1을 더한 값(cnt번 반복)을 추가
            foodList.addAll(List(cnt) { idx + 1 })
        }

        // foodList를 문자열로 변환하여 연결하고, "0"을 추가한 뒤, foodList를 뒤집어서 다시 문자열로 변환하여 연결
        return foodList.joinToString("") + "0" + foodList.reversed().joinToString("")
    }
}