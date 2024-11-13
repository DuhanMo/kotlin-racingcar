package calculator

class StringCalculator {
    fun calculate(input: String?): String {
        val parseResult = InputParser(InputValidator()).parse(input)
        val numbers = parseResult.numbers
        val operators = parseResult.operators
        val calculator = Calculator()

        val result =
            numbers.drop(1).zip(operators)
                .fold(numbers[0]) { acc, (number, operator) ->
                    calculator.calculate(acc, number, operator)
                }
        return if (result % 1.0 == 0.0) result.toInt().toString() else result.toString()
    }
}
