package aAndI.aAndI3week.p7

fun main() {
    val inputA = readln().substringAfter("=").trim().toInt()
    println(solution(inputA))
}

fun solution(n: Int): Int {
    if (n == 0) return 0
    var result: Int = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun solutionRecursion(n: Int): Int {
    // 1. 기저 사례: N이 0이거나 1이면 1을 반환하고 끝낸다.
    if (n <= 1) return 1

    // 2. 재귀 단계: n * (N-1 팩토리얼)
    return n * solutionRecursion(n - 1)
}