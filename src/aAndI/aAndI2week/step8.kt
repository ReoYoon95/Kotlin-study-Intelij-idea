package aAndI.aAndI2week.p8

fun main() {
    val inputA = readln().removePrefix("a = ").trim().toInt()
    println(solution(inputA))

}

fun solution(a: Int): Int {
    val result = if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) 1
    else 0
    return result
}
