package racingcar.application

private const val MOVE_FORWARD_THRESHOLD = 4

class Car private constructor(
    var step: Int,
) {
    fun moveForward(condition: Int) {
        if (condition >= MOVE_FORWARD_THRESHOLD) {
            step++
        }
    }

    companion object {
        fun createDefault(): Car {
            return Car(step = 0)
        }
    }
}
