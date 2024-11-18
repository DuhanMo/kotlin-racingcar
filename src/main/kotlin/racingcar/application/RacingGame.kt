package racingcar.application

class RacingGame(
    private val carMoveConditionGenerator: CarMoveConditionGenerator,
    private val cars: List<Car>,
    val raceBoard: RaceBoard,
) {
    fun race(moveTryCount: Int) {
        repeat(moveTryCount) {
            cars.forEach { car ->
                val condition = carMoveConditionGenerator.generateRandomCondition()
                car.moveForward(condition)
            }
            raceBoard.recordRaceResultPerRound(cars)
        }
    }
}
