package sumOfNumbers;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class SumOfNumbersTest {
    private final SumOfNumbers sumOfNumbers = new SumOfNumbers();

    Stream<Arguments> getNumbers() {
        return Stream.of(
                Arguments.of(1, new int[]{1, 0}),
                Arguments.of(-1, new int[]{-1, 0}),
                Arguments.of(1, new int[]{0, 1}),
                Arguments.of(3, new int[]{1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("getNumbers")
    void getSum(int expected, int[] input) {
        assertEquals(expected, sumOfNumbers.getSum(input[0], input[1]));
        assertEquals(expected, sumOfNumbers.getSum(input[1], input[0]));
    }
}