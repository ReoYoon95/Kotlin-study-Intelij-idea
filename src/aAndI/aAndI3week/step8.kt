package aAndI.aAndI3week

fun main() {
    println("a값을 입력하시오: ")
    val inputA = readln()
        .substringAfter("[")
        .substringBefore("]")
        .split(",")
        .map { it.trim().toInt() }

    println(solution(inputA))

}

fun solution(listN: List<Int>): String {
    var maxNum = listN[0]
    for (i in 0..(listN.size - 2)) {  //이건 끝 인덱스까지 포문을 하라는 의미
        if (listN[i] > listN[i + 1]) {
            maxNum = listN[i]
        } else {
            maxNum = listN[i + 1]
        }
    }
    val answer = "$maxNum ${listN.indexOf(maxNum) + 1}"
    return answer
}

fun solution1(listN: List<Int>): String {
    // 1. 첫 번째 숫자를 일단 현재의 최댓값으로 설정합니다.
    var maxNum = listN[0]

    // 2. indices를 사용하여 리스트 전체를 순회합니다.
    for (i in listN.indices) {
        // '현재 챔피언(maxNum)'보다 '새로운 도전자(listN[i])'가 더 크면 챔피언 교체!
        if (listN[i] > maxNum) {
            maxNum = listN[i]
        }
    }

    // 3. 문자열 템플릿 `${}`를 사용하여 함수 호출 결과를 합칩니다.
    // 인덱스는 0부터 시작하므로 문제의 '몇 번째' 조건에 맞춰 +1을 합니다.
    return "$maxNum ${listN.indexOf(maxNum) + 1}"
}


fun solution2(listN: MutableList<Int>): String { //문제 잘못이해해서 버블정렬 함.
    for (i in 0..(listN.size - 2)) {  //이건 끝 인덱스까지 포문을 하라는 의미
//        for (i in 0..(listN.indices) {  //이건 끝 인덱스를 제외하고 끝까지 포문을 하라는 의미 until listN.size - 1 같은의미
        for (j in 0 until listN.size - 1) {   //이건 끝 인덱스를 제외하고 끝까지 포문 하라는 의미
            if (listN[j] > listN[j + 1]) {
                listN[j] = listN[j + 1].also { listN[j + 1] = listN[j] }
            }
        }
    }
    return ""
}
