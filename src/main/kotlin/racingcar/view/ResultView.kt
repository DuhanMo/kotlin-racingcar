package racingcar.view

import racingcar.domain.RaceBoard
import racingcar.domain.dto.CarPosition
import racingcar.domain.dto.Winner
import racingcar.view.CarViewConstant.COMMA
import racingcar.view.CarViewConstant.LINE_DELIMITER

object ResultView {
    fun announceRacingStart() {
        println("실행 결과")
    }

    fun printRacingResult(raceBoard: RaceBoard) {
        raceBoard.raceResultPerRounds
            .forEach { result ->
                printRacingResultPerRound(result.carPositions)
            }
    }

    fun printWinners(winners: List<Winner>) {
        println("${winners.joinToString(COMMA) { it.name }}가 최종 우승 했습니다.")
    }

    private fun printRacingResultPerRound(carPositions: List<CarPosition>) {
        carPositions.forEach { carPosition ->
            println("${carPosition.name} : ${LINE_DELIMITER.repeat(carPosition.position)}")
        }
        println()
    }
}
