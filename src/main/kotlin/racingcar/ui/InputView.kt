package racingcar.ui

import racingcar.application.Car
import racingcar.application.Car.Companion.createDefault
import racingcar.application.DefaultCarMoveConditionGenerator
import racingcar.application.RacingGame
import racingcar.ui.ResultView.printRacingStatus
import racingcar.ui.ResultView.printWinners

fun main() {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val cars = inputCars()
    println("시도할 횟수는 몇 회인가요?")
    val moveTryCount = readlnOrNull()?.toInt() ?: throw IllegalArgumentException()
    val racingGame = RacingGame(DefaultCarMoveConditionGenerator, cars)
    println("실행 결과")
    repeat(moveTryCount) {
        racingGame.race()
        printRacingStatus(cars)
    }
    printWinners(cars)
}

private fun inputCars(): List<Car> {
    return readlnOrNull()?.takeIf { it.isNotBlank() }
        ?.split(",")
        ?.map { createDefault(name = it) }
        ?: throw IllegalArgumentException("The name cannot be null or blank")
}
