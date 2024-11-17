package racingcar.application

class RacingGame(
    private val carMoveConditionGenerator: CarMoveConditionGenerator,
    private val cars: List<Car>,
) {
    fun race() {
        cars.forEach { car ->
            val condition = carMoveConditionGenerator.generate()
            car.moveForward(condition)
        }
    }
}
