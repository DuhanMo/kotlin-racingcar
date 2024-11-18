package racingcar.ui

import racingcar.application.Car

object ResultView {
    fun printRacingStatus(cars: List<Car>) {
        cars.forEach { car ->
            println("${car.name} : ${"-".repeat(car.position)}")
        }
        println()
    }

    fun printWinners(cars: List<Car>) {
        val maxStep = cars.maxOf { it.position }
        val winners = cars.filter { it.position == maxStep }
        println("${winners.joinToString(",") { it.name }}가 최종 우승 했습니다.")
    }
}
