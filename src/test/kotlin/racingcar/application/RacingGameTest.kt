package racingcar.application

import io.kotest.core.spec.style.StringSpec
import io.kotest.inspectors.forAll
import io.kotest.matchers.shouldBe
import racingcar.mock.MockCarMoveConditionGenerator

class RacingGameTest : StringSpec({
    "random 값이 4 이상일 경우 차들은 전진한다" {
        val fixedValue = 4
        val generator = MockCarMoveConditionGenerator(fixedValue)
        val racingGame = RacingGame(generator)
        val cars = listOf(Car.createDefault(), Car.createDefault())
        racingGame.race(cars = cars)
        cars.forAll {
            it.step shouldBe 1
        }
    }

    "random 값이 4 미만일 경우 차들은 전진하지 않는다" {
        val fixedValue = 3
        val generator = MockCarMoveConditionGenerator(fixedValue)
        val racingGame = RacingGame(generator)
        val cars = listOf(Car.createDefault(), Car.createDefault())
        racingGame.race(cars = cars)
        cars.forAll {
            it.step shouldBe 0
        }
    }
})
