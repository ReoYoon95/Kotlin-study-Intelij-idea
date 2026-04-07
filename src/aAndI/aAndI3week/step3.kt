package aAndI.aAndI3week.p3

fun main() {
    println("a값을 입력하시오")
    val inputA = readln().substringAfter("=").trim()
    println("b값을 입력하시오")
    val inputB = readln().substringAfter("=").trim().toInt()
    println(solution(inputA, inputB))

}

fun solution(S: String, i: Int): Char {

    val result = S[i - 1]
    return result
}
