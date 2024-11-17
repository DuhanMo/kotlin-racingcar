package racingcar.application

private const val MOVE_FORWARD_THRESHOLD = 4

class Car private constructor(
    val name: String,
    var step: Int,
) {
    fun moveForward(condition: Int) {
        if (condition >= MOVE_FORWARD_THRESHOLD) {
            step++
        }
    }

    companion object {
        fun createDefault(name: String): Car {
            return Car(
                name = name,
                step = 0,
            )
        }
    }
}
