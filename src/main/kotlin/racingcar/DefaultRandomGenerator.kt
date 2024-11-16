package racingcar

import kotlin.random.Random

object DefaultRandomGenerator : RandomGenerator {
    override fun generate(until: Int): Int = Random.nextInt(until)
}
