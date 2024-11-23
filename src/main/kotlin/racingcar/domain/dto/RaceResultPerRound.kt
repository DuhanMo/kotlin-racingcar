package racingcar.domain.dto

import racingcar.domain.Car

class RaceResultPerRound(
    val carPositions: List<CarPosition>,
) {
    fun findWinners(): List<Winner> {
        val maxPosition = findMaxPosition() ?: return emptyList()

        return carPositions
            .filter { it.position == maxPosition }
            .map { Winner(it.name) }
    }

    private fun findMaxPosition(): Int? {
        return carPositions
            .maxOfOrNull { it.position }
    }

    companion object {
        fun fromCars(cars: List<Car>): RaceResultPerRound {
            return RaceResultPerRound(cars.map { CarPosition.from(it) })
        }
    }
}
