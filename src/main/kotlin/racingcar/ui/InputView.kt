package racingcar.ui

import racingcar.application.CarManager
import racingcar.application.DefaultCarMoveConditionGenerator
import racingcar.application.RacingGame
import racingcar.ui.ResultView.print

fun main() {
    println("자동차 대수는 몇 대인가요?")
    val numberOfCars = readlnOrNull()?.toInt() ?: throw IllegalArgumentException()
    println("시도할 횟수는 몇 회인가요?")
    val moveTryCount = readlnOrNull()?.toInt() ?: throw IllegalArgumentException()

    val cars = CarManager.createCars(numberOfCars)
    val racingGame = RacingGame(DefaultCarMoveConditionGenerator)
    println("실행 결과")
    repeat(moveTryCount) {
        print(cars = racingGame.race(cars))
    }
}
