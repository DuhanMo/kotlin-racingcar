package racingcar.application

private const val MOVE_FORWARD_THRESHOLD = 4
private const val CAR_NAME_LENGTH_LIMIT = 5
private const val STARTING_POSITION = 0

class Car private constructor(
    val name: String,
    var position: Int,
) {
    fun moveForward(condition: Int) {
        if (condition >= MOVE_FORWARD_THRESHOLD) {
            position++
        }
    }

    companion object {
        fun createDefault(name: String): Car {
            require(name.trim().length <= CAR_NAME_LENGTH_LIMIT) { "자동차 이름은 5자를 초과할 수 없습니다" }
            return Car(
                name = name,
                position = STARTING_POSITION,
            )
        }
    }
}
