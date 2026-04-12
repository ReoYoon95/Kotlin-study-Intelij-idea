package aAndI.aAndI4week.p2

fun main() {
    val inputA = readln().substringAfter("=").trim().toInt()
    println(solution(inputA))
}

fun solution(n: Int): Int {
    if (n <= 1) return 1

    return n * solution(n - 1)
}

fun solution1(n: Int): Int {
    fun factorial(n: Int): Int {
        if (n == 0 || n == 1) return 1
        else return n * factorial(n - 1)
    }
    return factorial(n)
}