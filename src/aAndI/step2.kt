package aAndI.p2

fun main() {
    println(solution(readln()))
}

fun solution(a: String): String {

    val id: String = a.replace("a = ", "")
//    println("$id.replace??!")
    return "${id}??!"
}


//다른방식
// fun solution(a: String): String {
//    val id = a.replace("a = ", "")
//   return "${id}??!"
//}

// 한줄로 하는 방식
//fun solution(a: String): String = a.replace("a = ", "") + "??!"  or "${a.replace("a = ", "")}??!"
//    // 입력받자마자 바꾸고, 리턴.
