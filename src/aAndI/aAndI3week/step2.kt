package aAndI.aAndI3week

fun main() {
    println("배열을 입력하시오")
    val inputA = readln()
        .substringAfter("[")    // "[" 뒤만 남겨라 -> "1,4,1,2,4,2,4,2,3,4,4]"
        .substringBefore("]")   // "]" 앞만 남겨라 -> "1,4,1,2,4,2,4,2,3,4,4"
        .split(",")             // 쉼표로 쪼개라 -> ["1", "4", "1", ...] (문자열 리스트)
        .map { it.trim().toInt() } // 숫자로 바꿔라 -> [1, 4, 1, ...] (정수 리스트)
    println("찾을 숫자를 입력하시오.")
    val inputB = readln().removePrefix("b = ").trim().toInt()

    println(solution(inputA, inputB))

}

fun solution(a: List<Int>, b: Int): Int {
    var count = 0
    for (num in a) {
        if (b == num) count++
    }
    return count
}

