package aAndI.aAndI2week.p7

fun main() {
    val inputA = readln().removePrefix("a = ").trim().toInt()
    val inputB = readln().removePrefix("a = ").trim().toInt()
    println(solution(inputA, inputB))
}

fun solution(a: Int, b: Int): String {
    val result = when {
        a > b -> ">"
        a < b -> "<"
        else -> "=="
    }
    return result
}

fun solution1(a: Int, b: Int): String {
    val result =
        if (a > b) ">"
        else if (a < b) "<"
        else "=="
    return result
}

fun solution2(a: Int, b: Int): String {
    return if (a > b) ">" //아니면 return 을 바로 써도 됌
    else if (a < b) "<"
    else "=="
}