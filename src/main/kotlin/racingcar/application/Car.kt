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
            require(name.trim().length <= 5) { "자동차 이름은 5자를 초과할 수 없습니다" }
            return Car(
                name = name,
                step = 0,
            )
        }
    }
}
