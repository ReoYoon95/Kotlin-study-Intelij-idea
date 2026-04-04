package study.mar31

fun main() {

    //반드시 타입을 명시해줘야하는 경우가 아니라면 코틀린의 타입추론 기능을 활용해서 타입을 생략하는 것이 일반적이다.
    // 그래서 아래와 같이 타입을 생략할 수 있다.

    var a = 1234 //코틀린은 타입을 안써도 알아서 추론해준다. 그래서 타입을 생략할 수 있다.
    var b = 1234L //롱의 경우에는 마지막에 L을 붙인다.

    var c = 123.5 //    실수는 기본적으로 더블형으로 인식한다. 그래서 123.5는 double로 인식된다.
    var d = 123.5f //실수형에 f를 붙이면 float로 인식한다.

    var e = 0xABCD //16진수의 경우에는 0x를 앞에 붙이면된다
    var f = 0b10110110 //2진수의 경우에는 0b를 앞에 붙이면된다

    var g = true //불리언형은 true 또는 false 값을 가질 수 있다.
    var h = 'c' //문자형은 작은 따옴표로 감싸준다.

    println(add(5, 6, 7))
    doWhen(1)
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun add1(a: Int, b: Int, c: Int) = a + b + c
// 단일 표현 함수는 함수에서는 return 키워드와 중괄호를 생략할 수 있다.
// 또한 반환형의 타입추론이 가능하다면 반환형도 생략할 수 있다.

fun test() {
    var a = 7

    if (a > 10) {
        println("a는 10보다 크다.")
    } else println("a는 10보다 작거나 같다.")
    // if문에서 한줄이라면 중괄호는 생략할 수 있다.

    //예문
    val name: Any = "joonas"

    if (name is String) {
        // 💡 여기서 대박인 점! (스마트 캐스트)
        // 코틀린이 "아, name은 문자열이 맞네!"라고 확신해서
        // name을 바로 문자열처럼 쓸 수 있게 해줍니다.
        println(name.length) // 문자열 길이를 바로 잴 수 있음!
    }

//    Any: "뭐든지 담을 수 있는 만능 주머니"
//    is: "왼쪽이 오른쪽 타입인지 확인 (맞으면 변신!)"
//    !is: "왼쪽이 오른쪽 타입이 아닌지 확인"
// 파이썬과 다르게 코틀린은 변환이 필요없음. 스마트 캐스트로 is연산자가 작동 확인되는 순간 변호나됌.
// 스마트 캐스트: "코틀린이 타입을 알아서 캐스팅해주는 마법"
//파이썬의 isinstance()와 비슷한 역할을 한다고 생각하면 된다.
}

fun doWhen(a: Any) {
    when (a) {      //var result = when(a) { ... } 처럼 when의 결과를 변수에 담을 수도 있다.
        1 -> println("a는 1입니다.")
        "DiMo" -> println("DiMo입니다.")
        is Long -> println("a는 Long 타입입니다.")
        !is String -> println("a는 String 타입이 아닙니다.")
        else -> println("a는 1도 아니고 DiMo도 아니고 Long 타입")
//등호나 부등호의 사용은 불가. 여러개의 조건이 부합될 시 먼저 부합되는 것부터 실행.
    }

    // 부등호를 쓰고 싶을 때 방법.
    when {
        a is Int && a > 10 -> println("10보다 큰 숫자입니다.")
        a is Int && a < 0 -> println("음수입니다.")
        else -> println("그 외의 경우입니다.")
    }
}