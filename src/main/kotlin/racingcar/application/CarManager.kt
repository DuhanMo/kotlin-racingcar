package racingcar.application

object CarManager {
    fun createCars(numberOfCars: Int): List<Car> {
        return List(numberOfCars) { Car.createDefault() }
    }
}
