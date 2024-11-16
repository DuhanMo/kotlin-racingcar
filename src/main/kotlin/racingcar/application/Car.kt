package racingcar.application

class Car private constructor(
    var step: Int,
) {
    companion object {
        private const val MOVE_FORWARD_THRESHOLD = 4
        const val MOVE_FORWARD_CONDITION_BOUNDS = 10
    }

    constructor() : this(
        step = 0,
    )

    fun moveForward(condition: Int) {
        if (condition >= MOVE_FORWARD_THRESHOLD) {
            step++
        }
    }
}
