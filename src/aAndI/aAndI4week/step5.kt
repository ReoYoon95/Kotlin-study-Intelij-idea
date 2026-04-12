package aAndI.aAndI4week.p5

fun main() {

}

fun solution(n: Int): Int {
//    val result = n.toString().map { it.toString() }.sortedDescending().joinToString("").toInt()
//    val result = n.toString().split("").filter { it.isNotBlank() } 이렇게 해도 됌.
    val result = n.toString().map { it.digitToInt() }.sortedDescending().joinToString("").toInt()

    return result
}


fun solution1(n: Int): Int {
    return n.toString()
        .toCharArray()         // 1. 글자 배열로 만듦
        .sortedArrayDescending() // 2. 내림차순 정렬
        .joinToString("")      // 3. 합침
        .toInt()               // 4. 숫자로 변환
}

fun solution2(n: Int): Int {

    val result = n.toString()
        .toList()              // 글자 리스트로 쪼개기 ['2', '4', '3', '1']
        .sortedDescending()    // ['4', '3', '2', '1']
        .joinToString("")      // "4321"
        .toInt()               // 4321
    return result
}