package calculator

import calculator.Operator.ADD
import calculator.Operator.DIVIDE
import calculator.Operator.MULTIPLY
import calculator.Operator.SUBTRACT
import io.kotest.assertions.throwables.shouldThrowWithMessage
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class CalculatorTest : StringSpec({
    "덧셈을 하면 두 수를 더한다" {
        val sut = Calculator()
        sut.calculate(1.0, 2.0, ADD) shouldBeExactly 3.0
    }

    "뺄셈을 하면 두 수를 뺀다" {
        val sut = Calculator()
        sut.calculate(1.0, 2.0, SUBTRACT) shouldBeExactly -1.0
    }

    "곱하기를 하면 두 수를 곱한다" {
        val sut = Calculator()
        sut.calculate(3.0, 2.0, MULTIPLY) shouldBeExactly 6.0
    }

    "나누기를 하면 두 수를 나눈다" {
        val sut = Calculator()
        sut.calculate(10.0, 2.0, DIVIDE) shouldBeExactly 5.0
    }

    "어떤 수를 0으로 나누면 예외 발생한다" {
        val sut = Calculator()
        shouldThrowWithMessage<IllegalArgumentException>("Division by zero is not allowed") {
            sut.calculate(10.0, 0.0, DIVIDE)
        }
    }
})
