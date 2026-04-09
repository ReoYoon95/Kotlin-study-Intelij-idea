package aAndI.aAndI3week.p9

fun main() {

}

fun solution(s: String): Boolean {
    var result = 1
    for (i in s.indices) {
        if (s[i] == s[s.length - 1 - i]) result *= 1
        else result *= 0
//        result *= if (s[i] == s[s.length - 1 - i]) 1  //이방식으로 할 수도 있음.
//        else 0
    }
//    val answer = if (result == 1) true else false
    val answer = result == 1 //위에 if문 불필요한 이유는 result == 1 이거 자체가 맞으면 참이고, 아니면 거짓이 답변되기에.

    return answer
}

fun solution1(s: String): Boolean {
    for (i in 0 until s.length / 2) { // 0부터 끝을 제외한 범위 까지. 예를들어 길이가 6이면 0~2까지
        if (s[i] != s[s.length - 1 - i]) return false
    }
    return true
}

fun isPalindrome(s: String): Boolean {
    // 문자열을 뒤집은 값과 원본을 비교합니다.
    return s == s.reversed()
}