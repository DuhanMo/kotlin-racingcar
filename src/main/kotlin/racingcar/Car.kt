package racingcar

private const val MOVE_FORWARD_THRESHOLD = 4

class Car private constructor(
    var step: Int,
) {
    constructor() : this(
        step = 0,
    )

    fun moveForward(condition: Int) {
        if (condition >= MOVE_FORWARD_THRESHOLD) {
            step++
        }
    }
}
