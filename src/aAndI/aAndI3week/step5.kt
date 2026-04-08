package aAndI.aAndI3week.p5
//계속 2번째 오답이 나옴.

fun main() {
    println("a를 입력하시오: ")
    val inputA = readln()
        .substringAfter("[")
        .substringBefore("]")
        .split(",")
        .map{it.trim().toInt()}
    println("b를 입력하시오: ")
    val inputB = readln().substringAfter("=").trim().toInt()
    println(solution(inputA,inputB))
}

fun solution(list_A: List<Int>, X: Int): String {
    val result = StringBuilder()
    for (num in list_A) {
        if (X > num) {
            result.append("$num ")
        }
    }
    return result.toString().trim()
}

fun solution1(list_A: List<Int>, X: Int): String {
// 1. list_A.filter { it < X }
    //    -> 결과: List<Int> (예: [1, 4, 2])

    // 2. .joinToString(" ")
    //    -> 결과: String (예: "1 4 2")

    return list_A.filter { it < X }.joinToString(" ")
}

fun solution2(list_A: List<Int>, X: Int): String {
    val result = list_A.filter {it < X}
    val resultString = result.joinToString(" ")
    return  resultString
// 1. list_A.filter { it < X }
    //    -> 결과: List<Int> (예: [1, 4, 2])

    // 2. .joinToString(" ")
    //    -> 결과: String (예: "1 4 2")

//    return list_A.filter { it < X }.joinToString(" ")
}
