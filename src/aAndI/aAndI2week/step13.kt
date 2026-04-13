package aAndI.aAndI2week.p13

import javax.management.Query.or

fun main() {

}

fun solution(line: String): Boolean {
    return if (line.contains(Regex("(DEBUG|INFO|WARN|ERROR)"))) {
        true
    } else {
        false
    }
}

fun solution1(line: String): Boolean {
    val result = when {
        "DEBUG" in line -> true
        "INFO" in line -> true
        "WARN" in line -> true
        "ERROR" in line -> true
        else -> false
    }
    return result
}

fun solution2(line: String): Boolean {
    return when {
        line.contains("DEBUG") -> true
        line.contains("INFO") -> true
        line.contains("WARN") -> true
        line.contains("ERROR") -> true
        else -> false
    }
}

fun solution3(line: String): Boolean {

    val LOG_LEVELS = listOf("DEBUG", "INFO", "WARN", "ERROR")

    return LOG_LEVELS.any { line.contains(it) }
}

//.any의 사용예시
//val numbers = listOf(1, 3, 5, 8, 11)
//
//// it이 1, 3, 5... 순서대로 들어오다가 8이 되는 순간 true!
//val hasEven = numbers.any { it % 2 == 0 }
//
//println(hasEven) // 출력: true
//====================================================
//val chatMessage = "안녕하세요 바보님 반갑습니다."
//val badWords = listOf("바보", "멍청이", "해킹")
//
//// 금지어 리스트 중 하나라도(it) 메시지에 포함되어 있으면 true!
//val isBad = badWords.any { chatMessage.contains(it) }
//
//println(isBad) // 출력: true




// contains 는 단순히 ~~가 포함되어 있는지 한번 확인할떄 사용
// containMatchIn 은 이 정밀한 패턴중에 이게 있는지 확인할때 사용
//단 regex와 같이 사용
//regex.containsMatchIn(~~) 식으로 사용