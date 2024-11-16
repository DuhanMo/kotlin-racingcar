package calculator

fun main() {
    val calculator = StringCalculator()
    while (true) {
        print("계산할 문자열을 입력해주세요. ('exit'을 입력하면 종료됩니다): ")
        val input = readlnOrNull() ?: throw IllegalArgumentException("The input cannot be null")
        if (input.lowercase() == "exit") {
            println("종료합니다.")
            break
        }
        try {
            println(calculator.calculate(input))
        } catch (ex: Exception) {
            println(ex.message)
        }
    }
}
