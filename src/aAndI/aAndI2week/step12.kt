package aAndI.aAndI2week.p12
//질문필요함. 오답이 나옴.


fun main() {
    val inputB = readln()
    println(solution(inputB))
}


fun solution(branchName: String): Boolean {
    val inputA = branchName.removePrefix("a = ").trim()

    if (inputA.isEmpty()) return false

    val answer: Boolean = when {
        inputA.startsWith("feature/") && inputA.length > "feature/".length -> true
        inputA.startsWith("fix/") && inputA.length > "fix/".length -> true
        inputA.startsWith("hotfix/") && inputA.length > "hotfix/".length -> true
        inputA.startsWith("release/") && inputA.length > "release/".length -> true
        else -> false
    }
    return answer
}


fun solution1(branchName: String): Boolean {
    val inputA = branchName.removePrefix("a = ").trim()

    if (inputA.isEmpty()) return false

    fun isEnglishLetter(c: Char): Boolean {
        return c in 'a'..'z' || c in 'A'..'Z'
    }

    val answer: Boolean = when {
        inputA.startsWith("feature/") && inputA.length > "feature/".length && isEnglishLetter(inputA.last()) -> true
        inputA.startsWith("fix/") && inputA.length > "fix/".length && isEnglishLetter(inputA.last()) -> true
        inputA.startsWith("hotfix/") && inputA.length > "hotfix/".length && isEnglishLetter(inputA.last()) -> true
        inputA.startsWith("release/") && inputA.length > "release/".length && isEnglishLetter(inputA.last()) -> true
        else -> false
    }

    return answer
}


fun solution2(branchName: String): Boolean {
    // 1. 입력 문자열 정제 (이미지 예시에 따라 "a = " 제거 및 공백 제거)
    val inputA = branchName.removePrefix("a = ").trim()

    // 2. 허용된 접두사 리스트
    val prefixes = listOf("feature/", "fix/", "hotfix/", "release/")

    // 3. 각 접두사에 대해 규칙 검사
    for (prefix in prefixes) {
        // 접두사로 시작하는지 확인하고
        if (inputA.startsWith(prefix)) {
            // 접두사 뒤에 최소 한 글자 이상의 이름이 있는지 확인 (전체 길이 > 접두사 길이)
            return inputA.length > prefix.length
        }
    }

    // 4. 어떤 접두사에도 해당하지 않으면 false
    return false
}
