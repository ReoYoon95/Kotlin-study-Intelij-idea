package aAndI.aAndI4week.p4

fun main() {
    val inputA = readln().substringAfter("=").trim().toInt()
    println(solution(inputA))

}

fun solution(n: Int): Int {

    if (n == 0) return 0
    else if (n == 1) return 1

    return solution(n - 1) + solution(n - 2)
}

fun solution1(n: Int): Int = when (n) {
    0 -> 0
    1 -> 1
    else -> solution1(n - 1) + solution1(n - 2)
}

//fun solution1(n: Int): Int { //위 코드랑 같은거임.
//    return when (n) {
//        0 -> 0
//        1 -> 1
//        else -> solution1(n - 1) + solution1(n - 2)
//    }
//}