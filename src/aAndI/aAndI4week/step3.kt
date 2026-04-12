package aAndI.aAndI4week.p3

fun main() {
    val inputA = readln()
        .substringAfter("[")
        .substringBefore("]")
        .split(",")
        .map { it.trim().toInt() }
    val inputB = readln().substringAfter("=").trim().toInt()

    println(solution(inputA, inputB))

}

fun solution(listX: List<Int>, k: Int): Int {
    if (k <= 0 || k > listX.size) return 0
    val listScore = listX.toMutableList()

    fun quickSort(listN: MutableList<Int>, left: Int, right: Int) {
        if (left >= right) return

        val pivot = listN[(left + right) / 2]
        var i = left
        var j = right

        while (i <= j) {
            while (listN[i] < pivot) i++
            while (listN[j] > pivot) j--

            if (i <= j) {
                listN[i] = listN[j].also { listN[j] = listN[i] }
                i++
                j--
            }
        }
        quickSort(listN, left, j)
        quickSort(listN, i, right)
    }
    quickSort(listScore, 0, listScore.size - 1)

    return listScore[listScore.size - k]
}

fun solution1(listX: List<Int>, k: Int): Int {
    val sortedList = listX.sorted()
    return sortedList[sortedList.size - k]

}

fun solution2(listX: List<Int>, k: Int): Int {
    // 1. 범위를 벗어나면 즉시 리턴
    if (k !in 1..listX.size) return 0

    // 2. 코틀린의 기본 정렬 사용 (실무 권장)
    // 직접 구현하고 싶다면 현재 작성하신 quickSort를 그대로 쓰셔도 무방합니다.
    val sortedList = listX.sorted()

    // 3. 인덱스 계산을 변수로 빼서 의미 전달하기
    val targetIndex = sortedList.size - k
    return sortedList[targetIndex]
}