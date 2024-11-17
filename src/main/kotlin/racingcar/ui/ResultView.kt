package racingcar.ui

import racingcar.application.Car

object ResultView {
    fun print(cars: List<Car>) {
        cars.forEach { car ->
            println("-".repeat(car.step))
        }
        println()
    }
}
