package racingcar.domain

import racingcar.domain.RaceResultPerRound.Companion.fromCars

class RacingGame(
    private val cars: List<Car>,
) {
    fun race(
        moveTryCount: Int,
        carMovementDecider: CarMovementDecider,
    ): RaceBoard {
        val raceResultPerRounds = mutableListOf<RaceResultPerRound>()
        repeat(moveTryCount) {
            moveEachCar(carMovementDecider)
            raceResultPerRounds.add(fromCars(cars))
        }
        return RaceBoard(raceResultPerRounds.toList())
    }

    private fun moveEachCar(carMovementDecider: CarMovementDecider) {
        cars.forEach { car -> car.moveForward(carMovementDecider) }
    }
}
