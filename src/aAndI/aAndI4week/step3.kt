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
