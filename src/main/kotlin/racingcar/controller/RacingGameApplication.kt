package racingcar.controller

import racingcar.domain.Car
import racingcar.domain.DefaultCarMovementDecider
import racingcar.domain.RacingGame
import racingcar.view.InputView.inputCarNames
import racingcar.view.InputView.inputMoveTryCount
import racingcar.view.ResultView.announceRacingStart
import racingcar.view.ResultView.printRacingResult
import racingcar.view.ResultView.printWinners

fun main() {
    val cars = inputCarNames().map { Car(name = it) }
    val moveTryCount = inputMoveTryCount()
    val racingGame = RacingGame(cars)
    announceRacingStart()
    val raceBoard = racingGame.race(moveTryCount, DefaultCarMovementDecider())
    printRacingResult(raceBoard)
    printWinners(raceBoard.findWinners())
}
