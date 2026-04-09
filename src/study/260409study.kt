package study.apr09

fun main() {

    var a = Person("홍길동", 1990)
    var b = Person("김정일", 1992)
    var c = Person("김진우", 1980)

    var d = Person1("초롱이")
    var e = Person1("툴툴이")
    var f = Person1("뚱뚱이")

    var g = Animal("별이", 5, "강아지") //둘은 같은 결과임
    var h = Dog("둘이", 5)

    h.bark()

    var i = Cat("루이", 1)

    i.introduce()
    i.meow()



    println("안녕하세요, ${a.birthYear}년생 ${a.name}입니다.")
}

// 위의 프린트 처럼 하는 것을 편하게 하기위해 클래스 안에 함수를 생성할 수 있음.

class Person(var name: String, val birthYear: Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}

class Person1(var name: String, val birthYear: Int) {
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
        //this는 인스턴스 자신의 속성이나 함수를 호출하기 위해 클래스 내부에서 사용되는 키워드
    }

    constructor(name: String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }
}


//서브 클래스는 수퍼 클래스에 존재하는 속성과 같은이름의 속성을 가질 수없음
//즉 서브클래스는 var val을 선언하지 않는다.

//서브클래스가 생성될 때는 반드시 수퍼클래스의 생성자까지 호출되어야함
open class Animal(var name: String, var age: Int, var type: String) { //클래스는 기본적으로 상속이 안되는게 기본값
    fun introduce() {
        println("저는 #{type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog(name: String, age: Int) : Animal(name, age, "강아지") {
    fun bark() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹")
    }
}
