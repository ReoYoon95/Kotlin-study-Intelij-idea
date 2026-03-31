package aAndI.p3

fun main() {
    println(solution())
}

fun solution(): String {
    val a = """
       \    /\
        )  ( ')
       (  /  )
        \(__)|
    """.trimIndent()

    return a
}

// trimIndent() 는 모든 줄을 살펴보고 최소한의 왼쪽 공백만큼을 모든줄에서 똑같이 지움.
// trimMargin() 은 아래 예시처럼 내가 |(쉬프트백슬래쉬) 기호를 기준으로 다음부터 출력.
//val a = """
//    |    /\
//    | )  ( ')
//    |(  /  )
//    | \(__)|
//""".trimMargin()
