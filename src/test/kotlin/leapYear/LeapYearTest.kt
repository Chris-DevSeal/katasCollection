package leapYear

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class LeapYearTest {

    private val leapYear = LeapYear();

    @ParameterizedTest
    @CsvSource(
        "1234, false",
        "1984, true",
        "2000, true"
    )
    fun isLeapYearTest(input: Int, expected: Boolean) {
        val actual = leapYear.isLeapYear(input)

        assertEquals(expected, actual)
    }
}