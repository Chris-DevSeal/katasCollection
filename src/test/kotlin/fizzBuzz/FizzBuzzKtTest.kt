package fizzBuzz

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FizzBuzzKtTest {

    @ParameterizedTest
    @MethodSource("getInputs")
    fun fizzBuzz(expected: Array<String>, input: Int) {
        val actual = fizzBuzz(input)

        assertArrayEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun getInputs(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    arrayOf(
                        "1",
                        "2",
                        "Fizz",
                        "4",
                        "Buzz",
                        "Fizz",
                        "7",
                        "8",
                        "Fizz",
                        "Buzz",
                        "11",
                        "Fizz",
                        "13",
                        "14",
                        "FizzBuzz"
                    ), 15
                ),
            )
        }
    }

}