package calculator

class StringCalculator {
    fun calculate(input: String): Number {
        val parseResult = InputParser(InputValidator()).parse(input)
        val numbers = parseResult.numbers
        val operators = parseResult.operators

        var result = numbers[0]
        for (i in operators.indices) {
            val nextNumber = numbers[i + 1]
            val operator = operators[i]
            result = operator.operate(result, nextNumber)
        }
        return if (result.isInteger()) result.toInt() else result
    }
}
