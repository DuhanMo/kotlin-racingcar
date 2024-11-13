package calculator

import calculator.Operator.ADD
import calculator.Operator.DIVIDE
import calculator.Operator.MULTIPLY
import calculator.Operator.SUBTRACT

class Calculator {
    fun calculate(
        a: Double,
        b: Double,
        operator: Operator,
    ): Double =
        when (operator) {
            ADD -> add(a, b)
            SUBTRACT -> subtract(a, b)
            MULTIPLY -> multiply(a, b)
            DIVIDE -> divide(a, b)
        }

    private fun add(
        a: Double,
        b: Double,
    ): Double = a + b

    private fun subtract(
        a: Double,
        b: Double,
    ): Double = a - b

    private fun multiply(
        a: Double,
        b: Double,
    ): Double = a * b

    private fun divide(
        a: Double,
        b: Double,
    ): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Division by zero is not allowed")
        }
        return a / b
    }
}
