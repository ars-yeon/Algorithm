class Solution {
    fun solution(food: IntArray): String {
        val foodList = mutableListOf<Int>()

        for ((idx, cnt) in food.slice(1 until food.size).map { it / 2 }.withIndex()) {
            foodList.addAll(List(cnt) { idx + 1 })
        }

        return foodList.joinToString("") + "0" + foodList.reversed().joinToString("")
    }
}