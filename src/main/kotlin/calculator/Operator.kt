package calculator

enum class Operator(
    private val token: String,
) {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    ;

    companion object {
        fun fromToken(token: String): Operator =
            entries.find { it.token == token } ?: throw IllegalArgumentException("Not found operator from token")
    }
}
