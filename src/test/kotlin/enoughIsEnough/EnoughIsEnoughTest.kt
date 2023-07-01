package enoughIsEnough

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.*
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class EnoughIsEnoughTest {

    @ParameterizedTest
    @MethodSource("getInputs")
    fun deleteNthTest(numbers: IntArray, maxOcurrences: Int, expected: IntArray) {
        val actual = deleteNth(numbers, maxOcurrences)

        assertArrayEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun getInputs(): Stream<Arguments> {
            return Stream.of(
                of(intArrayOf(1, 2, 3, 4, 5), 0, intArrayOf()),
                of(intArrayOf(1, 2, 3, 1, 2, 1, 2, 3), 2, intArrayOf(1, 2, 3, 1, 2, 3)),
                of(intArrayOf(1, 2, 3, 1, 2, 1, 2, 3), 3, intArrayOf(1, 2, 3, 1, 2, 1, 2, 3)),
                of(intArrayOf(1, 2, 3, 1, 2, 1, 2, 3), 1, intArrayOf(1, 2, 3)),
            )
        }
    }
}