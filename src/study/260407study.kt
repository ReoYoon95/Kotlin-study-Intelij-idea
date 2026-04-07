package study.apr07

fun main() {


}

fun test1() {
    for (i in 1..10) {
        if (i == 3) {
            break //3이 되면 종료
        }
        println(i)
    }
}

fun test2() {
    for (i in 1..10) {
        if (i == 3) {
            continue //3을 패스하고 다시 포문으로 돌아감
        }
        println(i)
    }
}

fun test3() {
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
            println("i : $i, j : $j")
        }   //안쪽 포문에서만 끝나는게 아니라 전체 포문에서 끝.
    }
}

fun test4() {
    println(true && false)
    println(true || false)
    println(!true)
    println(!false)
}

fun test5() {
    var a = 6
    var b = 4

    println(a > 5 && b > 5)
}
