package calculator

import calculator.Operator.Companion.fromToken

class InputParser(
    private val validator: InputValidator,
) {
    fun parse(input: String): ParseResult {
        validator.validate(input)
        return ParseResult(
            numbers = NUMBER_REGEX.findAll(input).map { it.value.toDouble() }.toList(),
            operators = OPERATOR_REGEX.findAll(input).map { fromToken(it.value) }.toList(),
        )
    }

    companion object {
        private const val NUMBER_PATTERN = "\\d+(\\.\\d+)?"
        private const val ESCAPED_OPERATOR_PATTERN_PREFIX = "\\Q"
        private const val ESCAPED_OPERATOR_PATTERN_SUFFIX = "\\E"

        private val NUMBER_REGEX = NUMBER_PATTERN.toRegex()
        private val OPERATOR_REGEX =
            Operator.entries
                .joinToString(separator = "|", prefix = "(", postfix = ")") {
                    "$ESCAPED_OPERATOR_PATTERN_PREFIX${it.symbol}$ESCAPED_OPERATOR_PATTERN_SUFFIX"
                }
                .toRegex()
    }
}

data class ParseResult(
    val numbers: List<Double>,
    val operators: List<Operator>,
)
