package aAndI.aAndI2week.p10

fun main() {
    val inputA = readln().removePrefix("a = ").trim()
    println(solution(inputA))

}

fun solution(a: String): String {
    val result = a.removePrefix("a = ").trim()

    if (result.isEmpty()) return "RELATIVE"

    val answer = if (result[0] == '/') "UNIX_ABSOLUTE"
    else if (result.length >= 3 && result[0] in 'A'..'Z' && result[1] == ':' && result[2] == '\\') "WINDOWS_ABSOLUTE"
    else "RELATIVE"

    return answer
}

fun solution1(a: String): String {
    val result = a.removePrefix("a = ").trim()

    return when {
        result.isEmpty() -> "RELATIVE"
        result.startsWith("/") -> "UNIX_ABSOLUTE"
        result.length >= 3 && result[0] in 'A'..'Z' && result[1] == ':' -> "WINDOWS_ABSOLUTE"
        else -> "RELATIVE"
    }
}

//이 것은 왜 오답인가?? 분명 윈도우 드라이버 값으로보면 소문자도 true가 나와서 문제가 될 수 있겠지만, 입력값 자체로만 보면 문제는 없지 않나??
fun solution2(a: String): String {
    val result = a.removePrefix("a = ").trim()

    if (result.isEmpty()) return "RELATIVE"

    val answer = if (result[0] == '/') "UNIX_ABSOLUTE"
    else if (result.length >= 3 && result[0].isLetter() && result[1] == ':' && result[2] == '\\') "WINDOWS_ABSOLUTE"
    else "RELATIVE"

    return answer
}