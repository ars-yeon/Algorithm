fun main(args: Array<String>) {
    val s = readLine()!!
    val result = s.map { if (it.isLowerCase()) it.toUpperCase() else it.toLowerCase() }.joinToString("")
    println(result)
}