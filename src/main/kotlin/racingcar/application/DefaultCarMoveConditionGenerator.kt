package racingcar.application

import kotlin.random.Random.Default.nextInt

object DefaultCarMoveConditionGenerator : CarMoveConditionGenerator {
    override fun generate(until: Int): Int {
        return nextInt(until)
    }
}
