package makeNegativNumber;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class NegativeNumberMakerTest {
    private final NegativeNumberMaker negativeNumberMaker = new NegativeNumberMaker();

    @ParameterizedTest
    @MethodSource("getNumbers")
    void makeNegative(int expected, int input) {
        assertEquals(expected, negativeNumberMaker.makeNegative(input));
    }

    Stream<Arguments> getNumbers() {
        return Stream.of(
                Arguments.of(-5, 5),
                Arguments.of(0, 0),
                Arguments.of(-5, -5)
        );
    }
}