class Solution {
    fun solution(quiz: Array<String>): Array<String?> {
        return quiz.map { Item ->
            val (x, oper, y, _, z) = Item.split(" ")
            val correct = when (oper) {
                "+" -> x.toInt() + y.toInt() == z.toInt()
                "-" -> x.toInt() - y.toInt() == z.toInt()
                else -> false
            }
            if (correct) "O" else "X"
        }.toTypedArray()
    }
}
