package study

fun main() {
//    val result = sum(3, 5)
//    println(result)
//    printSum(4,6)
    var inputA = readln().trim()
    var inputV = readln().trim()
    println(solution1(listOf(1, 4, 1, 2, 4, 2, 4, 2, 3, 4, 4), 2))

}

fun sum(a : Int, b : Int) : Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("합계는 ${a + b}")
}

fun gugudan(a : Int): String {
    var result :String = ""
    for (i in 2..9) {
        result += ("$a * $i = ${a * i}\n")}
    return result
}

fun solution1(a: List<Int>, v: Int): Int {
    var answer = 0
    for (i in 0 .. a.size -1 ) {
        if( a[i] == v) answer++
    }
    return answer
}

fun solution2(a: String, b: Int): Char {
    var answer = a[b - 1]
    return answer
}