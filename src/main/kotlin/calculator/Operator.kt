package calculator

enum class Operator(
    val symbol: String,
    private val doOperate: (Double, Double) -> Double,
) {
    ADD("+", { a, b -> a + b }),
    SUBTRACT("-", { a, b -> a - b }),
    MULTIPLY("*", { a, b -> a * b }),
    DIVIDE("/", { a, b ->
        if (b == 0.0) {
            throw IllegalArgumentException("Division by zero is not allowed")
        } else {
            a / b
        }
    }),
    ;

    fun operate(
        a: Double,
        b: Double,
    ): Double = doOperate(a, b)

    companion object {
        fun fromToken(token: String): Operator =
            entries.find { it.symbol == token } ?: throw IllegalArgumentException("Not found operator from $token")

        fun isOperator(token: String): Boolean = entries.map { it.symbol }.contains(token)
    }
}
