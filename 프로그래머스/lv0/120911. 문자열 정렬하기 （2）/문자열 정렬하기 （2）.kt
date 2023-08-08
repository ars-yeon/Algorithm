class Solution {
    fun solution(str: String) = str.toList().map {if(it.isUpperCase()) it.toLowerCase() else it}.sorted().joinToString("")
}
