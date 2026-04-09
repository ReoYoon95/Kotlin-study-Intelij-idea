package aAndI.aAndI3week.p6

fun main() {
    println("a값을 입력하시오: ")
    val inputA = readln().substringAfter("=").trim()
    println(solution(inputA))
}

fun solution(S: String): String {
    if (S.isEmpty()) return ""
    val result = StringBuilder()
    result.append("${S[0]}${S[S.length - 1]}")
//    마지막 인덱스를 부르는 방법은 [length -1] or [.lastIndex]를 사용한다.
//    코틀린에서는 [-1]으로 마지막 인덱스 불러올 수 없음.
    return result.trim().toString()
}