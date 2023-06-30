package stringToCamelCase

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class StringToCamelCaseTest {

    @ParameterizedTest
    @CsvSource(
        "theStealthWarrior, the_stealth_warrior",
        "TheStealthWarrior, The-Stealth-Warrior",
        "theStealthWarrior, the-Stealth-Warrior",
        "theStealthWarrior, the_Stealth_Warrior",
    )
    fun convert(expected: String, input: String) {
        val actual = convert(input)

        assertEquals(expected, actual)
    }
}