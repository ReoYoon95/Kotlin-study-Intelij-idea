package study.apr04

fun main() {

    var a = 0

    while (a < 5) {
        println(a++) //후위연산자
    }

    while (a < 5) {
        println(++a) //전위연산자
    }

    do {
        println("이제 시작합니다. a : $a")
        a++
    } while (a < 5)

    for (i in 0..9 step 3) { // 인덱스로 사용할 i 는 var등을 안붙여도됌. step은 몇칸씩 뛰어라.
        print(i) //print는 줄바꿈이 없음.
    }

    for (i in 9 downTo 0 step 3) { // downTo은 위에서 아래로 내려가라.
        print("현재 값은 $i 입니다. ")
    }

    for (i in 'a'..'e') {
        print(i)
    }
}
