package aAndI.aAndI3week.p4

fun main() {
    println("a값을 입력하세요.")
    val inputA = readln().substringAfter("=").trim().toInt()
    println(solution(inputA))
    println(solution1(inputA))
}

fun solution(N: Int): String {
    val result = StringBuilder()
    for (i in 1..N) {
        for (j in 1..i) {
            result.append("*")
        }
        result.append("\n")
    }
    return result.toString()
}

fun solution1(N: Int): String {
    val result = StringBuilder()

    for (i in 1..N) {
        for (j in 1..N) {
            // [조건 확인] 현재 별의 번호(j)가 줄 번호(i)보다 크면?
            if (i < j) break // 더 이상 찍지 않고 안쪽 for문을 나갑니다.
            result.append("*") // 조건에 걸리지 않았다면 별을 출력합니다.
        }
        // 한 줄이 끝나면 줄바꿈을 합니다.
        result.append("\n")
    }
    return result.toString()
}