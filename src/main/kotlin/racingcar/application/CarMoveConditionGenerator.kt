package racingcar.application

interface CarMoveConditionGenerator {
    fun generate(until: Int): Int
}
