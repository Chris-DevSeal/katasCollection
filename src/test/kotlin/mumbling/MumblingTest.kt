package mumbling

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class MumblingTest {

    @ParameterizedTest
    @CsvSource(
        "abcd,A-Bb-Ccc-Dddd",
        "RqaEzty,R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy",
        "aba, A-Bb-Aaa",
        "aab, A-Aa-Bbb",
        "baa, B-Aa-Aaa"
    )
    fun accumTest(input: String, expected: String) {
        val actual = accum2(input)

        assertEquals(expected, actual)
    }

}