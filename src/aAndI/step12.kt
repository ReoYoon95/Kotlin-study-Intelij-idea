package aAndI.p12

fun main() {
    val inputB = readln().removePrefix("a = ").trim()
    println(solution(inputB))
}


fun solution(branchName: String): Boolean {
    val inputA = branchName.removePrefix("a = ").trim()

    val answer: Boolean = when {
        inputA.startsWith("feature/") && inputA.length > "feature/".length -> true
        inputA.startsWith("fix/") && inputA.length > "fix/".length -> true
        inputA.startsWith("hotfix/") && inputA.length > "hotfix/".length -> true
        inputA.startsWith("release/") && inputA.length > "release/".length -> true
        else -> false
    }

    return answer
}


//inputA.startsWith("feature/") && inputA.length > 8 -> "true"
