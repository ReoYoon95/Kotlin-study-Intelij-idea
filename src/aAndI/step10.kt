package aAndI.p10

fun main() {
    val inputA = readln().removePrefix("a = ").trim()
    println(solution(inputA))

}

fun solution(a: String): String {
    val result = a.trim()
    val answer: String

    if (result[0] == '/') answer = "UNIX_ABSOLUTE"
    else if (result.length >= 3 && result[0].isLetter() && result[1] == ':' && result[2] == '\\') answer =
        "WINDOWS_ABSOLUTE"
    else answer = "RELATIVE"

    return answer
}

fun solution1(a: String): String {
    val result = a.trim()
    return when {
        result.startsWith("/") -> "UNIX_ABSOLUTE"
        result.length >= 3 && result[0].isLetter() && result[1] == ':' && result[2] == '\\' -> "WINDOWS_ABSOLUTE"
        else -> "RELATIVE"
    }
}