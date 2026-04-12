package aAndI.aAndI4week.p1

fun main() {
    println("a값을 입력하시오: ")
    val inputA = readln()
        .substringAfter("[")
        .substringBefore("]")
        .split(",")
        .map { it.trim().toInt() }
    println(solution(inputA))

}

fun solution(listN: List<Int>): List<Int> {
    return listN.sorted()
}