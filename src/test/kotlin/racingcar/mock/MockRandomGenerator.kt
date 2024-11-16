package racingcar.mock

import racingcar.RandomGenerator

class MockRandomGenerator(private val fixedValue: Int) : RandomGenerator {
    override fun generate(until: Int): Int = fixedValue
}
