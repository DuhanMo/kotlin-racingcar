package racingcar.ui

import racingcar.application.Car.Companion.createDefault
import racingcar.application.DefaultCarMoveConditionGenerator
import racingcar.application.RacingGame
import racingcar.ui.ResultView.print

fun main() {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val cars =
        readlnOrNull()?.split(",")
            ?.map { createDefault(name = it) }
            ?: throw IllegalArgumentException()
    println("시도할 횟수는 몇 회인가요?")
    val moveTryCount = readlnOrNull()?.toInt() ?: throw IllegalArgumentException()
    val racingGame = RacingGame(DefaultCarMoveConditionGenerator, cars)
    println("실행 결과")
    repeat(moveTryCount) {
        racingGame.race()
        print(cars = racingGame.cars)
    }
    val maxStep = cars.maxOf { it.step }
    val winners = cars.filter { it.step == maxStep }
    println("${winners.joinToString(",") { it.name }}가 최종 우승 했습니다.")
}
