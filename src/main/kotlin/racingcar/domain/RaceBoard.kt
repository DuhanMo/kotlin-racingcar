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
        val maxPosition =
            lastRound.carPositions
                .maxOfOrNull { it.position }
                ?: return emptyList()
        return lastRound.carPositions
            .filter { it.position == maxPosition }
            .map { Winner(it.name) }
    }
}


