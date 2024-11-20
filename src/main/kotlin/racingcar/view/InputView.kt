package racingcar.view

import racingcar.domain.Car
import racingcar.domain.DefaultCarMovementDecider
import racingcar.domain.RacingGame
import racingcar.view.CarViewConstant.COMMA
import racingcar.view.ResultView.printRacingResult
import racingcar.view.ResultView.printWinners

fun main() {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val cars = inputCars()
    println("시도할 횟수는 몇 회인가요?")
    val moveTryCount =
        readlnOrNull()?.toInt()
            ?: throw IllegalArgumentException("The try count cannot be null")
    val racingGame = RacingGame(cars)
    println("실행 결과")
    val raceBoard = racingGame.race(moveTryCount, DefaultCarMovementDecider())
    printRacingResult(raceBoard)
    printWinners(raceBoard)
}

private fun inputCars(): List<Car> {
    return readlnOrNull()?.takeIf { it.isNotBlank() }
        ?.split(COMMA)
        ?.map { Car(name = it) }
        ?: throw IllegalArgumentException("The name cannot be null or blank")
}
