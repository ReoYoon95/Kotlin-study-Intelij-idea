package aAndI.aAndI3week.p1

fun main() {
    val inputA = readln().removePrefix("a = ").trim().toInt()
    println(solution(inputA))

}


fun solution(a: Int): String {
    var result = ""
    for (i in 1..9) {
        result += "$a * $i = ${a * i}\n"
    }
    return result
}

fun solution1(a:Int):String {
    val sb = StringBuilder()
    for (i in 1..9) {
        sb.append("$a * $i = ${a * i}\n")
    }
    return sb.toString()
}