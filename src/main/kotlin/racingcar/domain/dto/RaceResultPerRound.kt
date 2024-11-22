package racingcar.domain.dto

import racingcar.domain.Car

data class RaceResultPerRound(
    val carPositions: List<CarPosition>,
) {
    companion object {
        fun fromCars(cars: List<Car>): RaceResultPerRound {
            return RaceResultPerRound(cars.map { CarPosition.from(it) })
        }
    }
}
