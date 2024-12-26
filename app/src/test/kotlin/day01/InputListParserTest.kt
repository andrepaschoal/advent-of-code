package day01

import kotlin.test.Test
import kotlin.test.assertEquals

class InputListParserTest {

    @Test
    fun `should parse the input list into ascending sorted lists`() {
        val expected = Pair(
            listOf(1, 2, 3, 3, 3, 4),
            listOf(3, 3, 3, 4, 5, 9),
        )

        val parsed = InputListParser().parse(
            arrayOf(
                "3   4",
                "4   3",
                "2   5",
                "1   3",
                "3   9",
                "3   3",
            )
        )

        assertEquals(expected, parsed)
    }
}
