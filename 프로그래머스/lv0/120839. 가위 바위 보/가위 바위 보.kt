class Solution {
    fun solution(rsp: String) = rsp.split("").joinToString("") {
        when (it) {
            "0" -> "5"
            "2" -> "0"
            "5" -> "2"
            else -> ""
        }
    }
}