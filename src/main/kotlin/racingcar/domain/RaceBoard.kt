package racingcar.domain

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

data class RaceResultPerRound(
    val carPositions: List<CarPosition>,
) {
    companion object {
        fun fromCars(cars: List<Car>): RaceResultPerRound {
            return RaceResultPerRound(cars.map { CarPosition(it) })
        }
    }
}

data class CarPosition(
    val name: String,
    val position: Int,
) {
    constructor(car: Car) : this(
        name = car.name,
        position = car.position,
    )
}

data class Winner(
    val name: String,
)
