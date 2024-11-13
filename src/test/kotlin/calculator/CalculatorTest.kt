package calculator

import io.kotest.assertions.throwables.shouldThrowWithMessage
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class CalculatorTest : StringSpec({
    "덧셈을 하면 두 수를 더한다" {
        val sut = Calculator()
        sut.add(1.0, 2.0) shouldBeExactly 3.0
    }

    "뺄셈을 하면 두 수를 뺀다" {
        val sut = Calculator()
        sut.subtract(1.0, 2.0) shouldBeExactly -1.0
    }

    "곱하기를 하면 두 수를 곱한다" {
        val sut = Calculator()
        sut.multiply(3.0, 2.0) shouldBeExactly 6.0
    }

    "나누기를 하면 두 수를 나눈다" {
        val sut = Calculator()
        sut.divide(10.0, 2.0) shouldBeExactly 5.0
    }

    "어떤 수를 0으로 나누면 예외 발생한다" {
        val sut = Calculator()
        shouldThrowWithMessage<IllegalArgumentException>("Division by zero is not allowed") {
            sut.divide(10.0, 0.0)
        }
    }
})
