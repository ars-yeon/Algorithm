class Solution {
    fun solution(quiz: Array<String>): Array<String?> {
        val res = arrayOfNulls<String>(quiz.size)
        for (i in quiz.indices) {
            val arr = quiz[i].split(" ").toTypedArray()
            if (arr[1] == "+") {
                if (arr[0].toInt() + arr[2].toInt() == arr[4].toInt()) {
                    res[i] = "O"
                } else {
                    res[i] = "X"
                }
            } else if (arr[1] == "-") {
                if (arr[0].toInt() - arr[2].toInt() == arr[4].toInt()) {
                    res[i] = "O"
                } else {
                    res[i] = "X"
                }
            }
        }
        return res
    }
}