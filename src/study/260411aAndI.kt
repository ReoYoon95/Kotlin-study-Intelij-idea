package study.apr11aAndI

fun main() {
//    println(solution(listOf(8, 5, 7, 2, 4)))
    println(solution1(listOf(15, 30, 60, 5, 35, 18)))
}


fun solution(list_S: List<Int>): List<Int> {    //선택정렬
    val list_S = list_S.toMutableList()
    val n = list_S.size
    for (i in 0..n - 2) {
        var minIndex = i
        for (j in i + 1..n - 1) {
            if (list_S[j] < list_S[minIndex]) {
                minIndex = j
            }
        }
// swap
        val temp = list_S[i]
        list_S[i] = list_S[minIndex]
        list_S[minIndex] = temp
    }
    return list_S
}


/* kotlin */
fun solution1(list_S: List<Int>): List<Int> {
    val list_S = list_S.toMutableList()
    quickSort(list_S, 0, list_S.size - 1)
    return list_S
}

fun quickSort(list_S: MutableList<Int>, left: Int, right: Int) {
    if (left >= right) return

    val pivot = list_S[(left + right) / 2]
    var i = left
    var j = right

    while (i <= j) {
        while (list_S[i] < pivot) i++
        while (list_S[j] > pivot) j--

        if (i <= j) {
            val temp = list_S[i]
            list_S[i] = list_S[j]
            list_S[j] = temp
            i++
            j--
        }
    }

    quickSort(list_S, left, j)
    quickSort(list_S, i, right)
}
