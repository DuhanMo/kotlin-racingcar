package calculator

fun main() {
    val calculator = StringCalculator()
    while (true) {
        print("계산할 문자열을 입력해주세요. ('exit'을 입력하면 종료됩니다): ")
        val input = readLine()
        if (input?.lowercase() == "exit") {
            println("종료합니다.")
            break
        }
        runCatching {
            println(calculator.calculate(input))
        }.getOrElse { ex ->
            println(ex.message)
        }
    }
}
