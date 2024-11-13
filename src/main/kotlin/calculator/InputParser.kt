package calculator

import calculator.Operator.Companion.fromToken

class InputParser(
    private val validator: InputValidator,
) {
    fun parse(input: String?): ParseResult {
        validator.validate(input)
        val numberRegex = "\\d+(\\.\\d+)?".toRegex()
        val operatorRegex = "[+\\-*/]".toRegex()
        return ParseResult(
            numbers = numberRegex.findAll(input!!).map { it.value.toDouble() }.toList(),
            operators = operatorRegex.findAll(input).map { fromToken(it.value) }.toList(),
        )
    }
}

data class ParseResult(
    val numbers: List<Double>,
    val operators: List<Operator>,
)
