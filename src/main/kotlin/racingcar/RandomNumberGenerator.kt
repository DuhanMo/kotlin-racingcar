package racingcar

import kotlin.random.Random.Default.nextInt

object RandomNumberGenerator {
    fun generate(until: Int): Int = nextInt(until)
}
