package aAndI.aAndI4week.p6

fun main() {
    val inputA = readln().substringAfter("=").trim()
    println(solution(inputA))

}


fun solution(s: String): List<Int> {
    var count = 0

    fun palindrome(s: String): List<Int> {
        count++
        if (s.length <= 1) {
            return listOf(1, count)
        }
        if (s[0] != s[s.length - 1]) {
            return listOf(0, count)
        }

        return palindrome(s.substring(1, s.length - 1))
    }

    return palindrome(s)
}