package racingcar.application

class RacingGame(
    private val carMovementDecider: CarMovementDecider,
    private val cars: List<Car>,
) {
    fun race(moveTryCount: Int): RaceBoard {
        val raceResultPerRounds = mutableListOf<RaceResultPerRound>()
        repeat(moveTryCount) {
            moveEachCar()
            val carPositions = cars.map { CarPosition(it) }
            raceResultPerRounds.add(RaceResultPerRound(carPositions))
        }
        return RaceBoard(raceResultPerRounds.toList())
    }

    private fun moveEachCar() {
        cars.filter { carMovementDecider.canMove() }
            .forEach { car -> car.moveForward() }
    }
}
