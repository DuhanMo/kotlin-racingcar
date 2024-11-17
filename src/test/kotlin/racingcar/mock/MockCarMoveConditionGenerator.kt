package racingcar.mock

import racingcar.application.CarMoveConditionGenerator

class MockCarMoveConditionGenerator(private val fixedValue: Int) : CarMoveConditionGenerator {
    override fun generate(until: Int): Int = fixedValue
}
