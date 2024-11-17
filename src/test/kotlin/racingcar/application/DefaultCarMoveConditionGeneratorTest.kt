package racingcar.application

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class DefaultCarMoveConditionGeneratorTest : StringSpec({
    "전진조건 생성 시 정수를 반환한다" {
        DefaultCarMoveConditionGenerator.generate().javaClass shouldBe Int::class.java
    }
})
