package racingcar.ui

import racingcar.application.Car

object ResultView {
    fun printRacingStatus(cars: List<Car>) {
        cars.forEach { car ->
            println("${car.name} : ${"-".repeat(car.step)}")
        }
        println()
    }

    fun printWinners(cars: List<Car>) {
        val maxStep = cars.maxOf { it.step }
        val winners = cars.filter { it.step == maxStep }
        println("${winners.joinToString(",") { it.name }}가 최종 우승 했습니다.")
    }
}
