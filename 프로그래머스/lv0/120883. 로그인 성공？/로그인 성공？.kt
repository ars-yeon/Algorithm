class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var result = "fail"
        for(user in db) {
            if(user[0]==id_pw[0] && user[1]==id_pw[1]) {
                result = "login"
            } else if(user[0]==id_pw[0] && user[1]!=id_pw[1]) {
                result = "wrong pw"
            }
        }
        return result
    }
}