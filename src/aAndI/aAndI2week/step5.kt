package aAndI.aAndI2week.p5

fun main() {
    val inputA = readln().replace("a = ", "").toInt()
    val inputB = readln().replace("b = ", "").toInt()
    println(solution(inputA, inputB))

}

fun solution(a: Int, b: Int): String {
    val mathArr: IntArray = intArrayOf(a + b, a - b, a * b, a / b, a % b)

    return "${mathArr[0]}\n${mathArr[1]}\n${mathArr[2]}\n${mathArr[3]}\n${mathArr[4]}"
}

fun solution1(a: Int, b: Int): String {
    val mathArr: IntArray = intArrayOf(a + b, a - b, a * b, a / b, a % b)
    return mathArr.joinToString(separator = "\n")
}


//joinToString은 컬렉션의 모든 요소를 문자열로 변환하여 하나의 문자열로 결합하는 함수입니다.

//.joinToString( separator 가 기본값임.
//separator = ", ",   // 요소 사이사이에 들어갈 문자 (기본값: ", ")
//prefix = "[",        // 전체 결과의 맨 앞에 붙을 문자 (기본값: "")
//postfix = "]",       // 전체 결과의 맨 뒤에 붙을 문자 (기본값: "")
//limit = 3,           // 최대 몇 개까지 보여줄지 설정
//truncated = "..."    // limit을 넘었을 때 생략 표시 방법
//)