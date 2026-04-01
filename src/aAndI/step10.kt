package aAndI.p10

fun main() {
    val inputA = readln().removePrefix("a = ").trim()
    println(solution(inputA))

}

fun solution(a: String): String {
    val result = a.removePrefix("a = ").trim()
    val answer: String

    if (result.isEmpty()) return "RELATIVE"

    answer = if (result[0] == '/') "UNIX_ABSOLUTE"
    else if (result.length >= 3 && result[0] in 'A'..'Z' && result[1] == ':' && result[2] == '\\') "WINDOWS_ABSOLUTE"
    else "RELATIVE"

    return answer
}

fun solution1(a: String): String {
    val result = a.removePrefix("a = ").trim()
    return when {
        result.startsWith("/") -> "UNIX_ABSOLUTE"
        result.length >= 3 && result[0].isLetter() && result[1] == ':' -> "WINDOWS_ABSOLUTE"
        else -> "RELATIVE"
    }
}