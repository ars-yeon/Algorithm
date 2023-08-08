class Solution {
    fun solution(my_string: String): String {
        val strList = mutableListOf<Char>()
        
        for(i in my_string) {
            if (i.isUpperCase()) {
                strList.add(i.lowercaseChar())
            } else {
                strList.add(i.uppercaseChar())
            }
        }
        return strList.joinToString("")
    }
}

