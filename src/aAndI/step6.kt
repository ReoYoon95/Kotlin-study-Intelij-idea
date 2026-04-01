package aAndI.p6

fun main() {
    val inputA = readln().removePrefix("a = ").trim().toInt()
    val inputB = readln().removePrefix("b = ").trim().toInt()
    val inputC = readln().removePrefix("c = ").trim().toInt()
    println(solution(inputA, inputB, inputC))
}

// trim(): 앞과 뒤 모두 지웁니다. (가장 많이 씀)
//
//trimStart(): 앞쪽(왼쪽) 공백만 지웁니다.
//
//trimEnd(): 뒤쪽(오른쪽) 공백만 지웁니다.

fun solution(a: Int, b: Int, c: Int): Int {
    val answer = a + b + c
    return answer
}

