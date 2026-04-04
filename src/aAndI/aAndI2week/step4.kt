package aAndI.aAndI2week.p4

fun main() {
//    val inputA = readln().replace("a = ", "").toInt()
    val inputA = readln().removePrefix("a = ").toInt()
//    val inputB = readln().replace("b = ", "").toInt()
    val inputB = readln().removePrefix("a = ").toInt()
//removePrefix("파라미터") 는 앞에 이 것이 있으면 지워줘 라는 함수임.

    println(solution(inputA, inputB))
}

fun solution(a: Int, b: Int): Int {
    val answer = a + b
    return answer
}

//한줄 코드방식
//fun solution(a: Int, b: Int): Int = a + b
