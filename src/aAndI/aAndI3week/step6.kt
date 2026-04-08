package aAndI.aAndI3week

fun main() {
    println("a값을 입력하시오: ")
    val inputA = readln().substringAfter("=").trim()
    println(solution(inputA))
}

fun solution(S: String): String {
    if (S.isEmpty()) return ""
    val result = StringBuilder()
    result.append("${S[0]}${S[S.length - 1]}")
    return result.trim().toString()
}