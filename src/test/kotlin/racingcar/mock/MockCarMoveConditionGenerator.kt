package racingcar.mock

import racingcar.application.CarMoveConditionGenerator

class MockCarMoveConditionGenerator(private val fixedValue: Int) : CarMoveConditionGenerator {
    override fun generateRandomCondition(): Int = fixedValue
}
