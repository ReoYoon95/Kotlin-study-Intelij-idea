package study.mar30

fun main() {
    var a: Int = 123
    println(a)
//    코틀린은 변수에 값을 할당해줘야함. 그래서 초기값을 할당해주지 않으면 오류가 발생한다.
//    단 사용하기전에는 값이 할당되기만 하면 값을 할당 안해도 된다. 그래서 초기값을 할당해주지 않으면 오류가 발생한다.
    /*
    예시
        fun study.main() {
            val name: String // 1. 선언만 함 (OK!)

            // println(name) // ❌ 에러! 아직 값이 없는데 쓰려고 하면 혼납니다.

            name = "Gemini"  // 2. 나중에 값을 넣음 (OK!)
            println(name)    // 3. 이제 값이 있으니 사용 가능! (OK!)
        }
     */

//// 기본 자료형들
//    숫자형
//    => Byte, Short, Int, Long, Float, Double
//    문자형
//    => Char

    var b: Int? = null
//    null 을 쓰고 싶으면 타입에 ?붙일것

    var intValue: Int = 1234
    var longValue: Long = 1234L //롱의 경우에는 마지막에 L을 붙인다.
    var intValueByHex: Int = 0x1af //16진수의 경우에는 0x를 앞에 붙이면된다
    var intValueByBin: Int = 0b10110110 //2진수의 경우에는 0b를 앞에 붙이면된다

    var doubleValue: Double = 123.5 //    실수는 기본적으로 더블형으로 인식한다. 그래서 123.5는 double로 인식된다.
    var doubleValueWithExp: Double = 123.5e10 //지수 표현식도 가능하다.
    var floatValue: Float = 123.5f //실수형에 f를 붙이면 float로 인식한다.

    var charValue: Char = 'a' //문자형은 작은 따옴표로 감싸준다.
    var booleanValue: Boolean = true //불리언형은 true 또는 false 값을 가질 수 있다.
    var koreanCharValue: Char = '가' //코틀린은 유니코드 문자를 지원하므로 한글도 char로 표현할 수 있다.

    var stringValue: String = "one line string test" //한 줄 문자열은 큰 따옴표로 감싸준다.
    var multiLineStringValue = """
    여러 줄 문자열은 큰 따옴표 세 개로 감싸준다.
    여러 줄에 걸쳐서 문자열을 작성할 수 있다."""

//코틀린은 타입을 안써도 알아서 추론해준다. 그래서 타입을 생략할 수 있다.
    var inferredIntValue = 1234
    var inferredStringValue = "Hello, Kotlin!"


//형 변환 함수들 to뒤에 원하는 타입을 붙이면 된다.
//   toByte()
//   toShort()
//   toInt()
//   toLong()
//   toFloat()
//   toDouble()
//   toChar()

    var a1: Int = 54321
    var b1: Long = a1.toLong() //Int형인 a를 Long형으로 변환해서 b에 할당한다.

    var intArr = arrayOf(1, 2, 3, 4, 5) //Int형 배열을 생성한다.
    val arr2: Array<Int> = arrayOf(1, 2, 3)
    //Int형 배열을 생성하는 또 다른 방법이다. val로 선언했지만 배열의 요소는 변경할 수 있다.
    arr2[0] = 10 //arr2의 첫 번째 요소를 10으로 변경한다.

    var intArr2: IntArray = intArrayOf(1, 2, 3, 4, 5)
    //Int형 배열을 생성하는 또 다른 방법이다. IntArray는 기본형 배열로 더 효율적이다.
    intArr2[0] = 10 //intArr2의 첫 번째 요소를 10으로 변경한다.

//    Array<int> 와 IntArray의 차이
//    Array<Int>는 참조형 배열로, 각 요소가 Int 객체로 저장된다.
//    따라서 메모리 사용량이 더 많고, 성능이 떨어질 수 있다.
//    IntArray는 기본형 배열로, 각 요소가 실제 Int 값으로 저장된다.
//    따라서 메모리 사용량이 적고, 성능이 더 좋다.
//    일반적으로 숫자형 배열을 사용할 때는 IntArray와 같은 기본형 배열을 사용하는 것이 좋다.

    var nullArr = arrayOfNulls<Int>(5)
    //Int형 요소를 5개 가지는 null로 초기화된 배열을 생성한다.
    // var nullArr : Array<Int?> = arrayOfNulls(5) 와 같은 효과를 가진다.
    // 각 요소는 null로 초기화된다.
    nullArr[0] = 10 //nullArr의 첫 번째 요소를 10으로 변경한다.
    println(nullArr[1]) //nullArr의 두 번째 요소를 출력한다. null이 출력된다.


}




