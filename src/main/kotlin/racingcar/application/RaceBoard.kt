package racingcar.application

data class RaceBoard(
    val raceResultPerRounds: List<RaceResultPerRound>,
)

data class RaceResultPerRound(
    val carPositions: List<CarPosition>,
)

data class CarPosition(
    val name: String,
    val position: Int,
) {
    constructor(car: Car) : this(
        name = car.name,
        position = car.position,
    )
}
