package findUniqueNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UniqueNumberFinderTest {
    @ParameterizedTest
    @MethodSource("getNumberExamples")
    void findUniqueNumberTest(double[] input, double expected) {
        double actual = UniqueNumberFinder.findUniqueNumber(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findUniqueStringWithoutArrayTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> UniqueNumberFinder.findUniqueNumber(new double[]{}));
    }

    static Stream<Arguments> getNumberExamples() {
        return Stream.of(
                Arguments.of(new double[]{0, 0, 1}, 1),
                Arguments.of(new double[]{0, 1, 0}, 1),
                Arguments.of(new double[]{1, 0, 0}, 1)
        );
    }

}
