package aAndI.p11

fun main() {
    val inputA = readln().trim()
    println(solution(inputA))
}

fun solution(a: String): String {
    val result = a.trim()
    val answer: String
    val dotIndex = result.lastIndexOf('.')
    if (dotIndex == -1 || dotIndex == result.length - 1) return "NONE"
    //lastIndexOf 는 문자를 못찾을때 -1 반환.
    //result.length - 1은 점이 문자열의 끝에 있다는 뜻

    answer = result.substring((dotIndex + 1))
    //substring 함수는 (x번 ,y번(없으면 끝까지)) 인덱스부터 추출함.
    return answer
}

fun solution1(a: String): String {
    val result = a.trim()
    val dotIndex = result.lastIndexOf('.')

    // 점이 없거나(-1), 점이 마지막 칸(length-1)에 있다면 무조건 NONE
    if (dotIndex == -1 || dotIndex == result.length - 1) {
        return "NONE"
    }
    val answer = when {
        dotIndex >= 0 -> result.substring(dotIndex + 1)
        else -> "NONE"
    }

    return answer
}

fun solution2(a: String): String {
    val result = a.trim()
    val len = result.length
    var dotIndex = -1

    for (i in len - 1 downTo 0) { //downto 는 역순으로 포문을 위에서 아래로 할 수 있게 해줌.
        if (result[i] == '.') {
            dotIndex = i
            break
        }
    }

    if (dotIndex == -1 || dotIndex == len - 1) return "NONE"

    var answer = ""

    for (i in dotIndex + 1..len - 1) answer += result[i]
    return answer
}
