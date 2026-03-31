package aAndI

fun main() {
    val inputa = readln().replace("a = ", "").toInt()
    val inputb = readln().replace("b = ", "").toInt()

    println(solution(inputa, inputb))
}

fun solution(a: Int, b: Int): Int {
    val answer = a + b
    return answer
}

//한줄 코드방식
//fun solution(a: Int, b: Int): Int = a + b
