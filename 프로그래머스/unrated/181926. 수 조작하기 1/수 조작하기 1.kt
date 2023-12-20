class Solution {
    fun solution(n: Int, control: String): Int {
        var num = n
        for (cmd in control) {
            when (cmd) {
                'w' -> num++
                's' -> num--
                'd' -> num += 10
                'a' -> num -= 10
            }
        }
        return num
    }
}