package aAndI.p9

fun main() {

}


fun solution(a: Int, b: Int): String {
    
    var min = b
    var hour = a
    
    if (b >= 45) {
        min -= 45
    }
    else if (b < 45) {
        min += 15
        hour -= 1
        
        if (hour < 0) {
            hour += 24
        }
    }
    val answer = "$hour $min"
    return answer
}