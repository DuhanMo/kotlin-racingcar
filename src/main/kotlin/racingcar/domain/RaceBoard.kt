package racingcar.domain

import racingcar.domain.dto.RaceResultPerRound
import racingcar.domain.dto.Winner

class RaceBoard(
    val raceResultPerRounds: List<RaceResultPerRound>,
) {
    fun findWinners(): List<Winner> {
        val lastRound =
            raceResultPerRounds.lastOrNull()
                ?: return emptyList()
        return lastRound.findWinners()
    }
}
