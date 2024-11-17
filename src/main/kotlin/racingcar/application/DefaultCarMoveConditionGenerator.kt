package racingcar.application

import kotlin.random.Random.Default.nextInt

private const val MOVE_FORWARD_CONDITION_BOUNDS = 10

object DefaultCarMoveConditionGenerator : CarMoveConditionGenerator {
    override fun generateRandomCondition(): Int {
        return nextInt(MOVE_FORWARD_CONDITION_BOUNDS)
    }
}
