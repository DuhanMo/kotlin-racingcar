package racingcar.application

import racingcar.application.Car.Companion.MOVE_FORWARD_CONDITION_BOUNDS

class RacingGame(
    private val carMoveConditionGenerator: CarMoveConditionGenerator,
) {
    fun race(cars: List<Car>): List<Car> {
        cars.forEach { car ->
            val condition = carMoveConditionGenerator.generate(MOVE_FORWARD_CONDITION_BOUNDS)
            car.moveForward(condition)
        }
        return cars
    }
}
