package day01

import kotlin.test.Test
import kotlin.test.assertEquals

class DistanceCalculatorTest {

    @Test
    fun `should calculate distance`() {
        assertEquals(11,
            DistanceCalculator().calculate(
                arrayOf(
                    "3   4",
                    "4   3",
                    "2   5",
                    "1   3",
                    "3   9",
                    "3   3",
                )
            )
        )
    }
}
