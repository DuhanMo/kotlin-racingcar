package racingcar.application

import racingcar.application.RaceResultPerRound.Companion.fromCars

class RacingGame(
    private val carMovementDecider: CarMovementDecider,
    private val cars: List<Car>,
) {
    fun race(moveTryCount: Int): RaceBoard {
        val raceResultPerRounds = mutableListOf<RaceResultPerRound>()
        repeat(moveTryCount) {
            moveEachCar()
            raceResultPerRounds.add(fromCars(cars))
        }
        return RaceBoard(raceResultPerRounds.toList())
    }

    private fun moveEachCar() {
        cars.filter { carMovementDecider.canMove() }
            .forEach { car -> car.moveForward() }
    }
}
