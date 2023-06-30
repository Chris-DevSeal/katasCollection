package collatz;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CollatzTest {
    private final Collatz collatz = new Collatz();

    @ParameterizedTest
    @MethodSource("getInput")
    void collatz(String expected, int input) {
        String actual = collatz.collatz(input);

        assertEquals(expected, actual);

    }

    Stream<Arguments> getInput() {
        return Stream.of(
                of("3->10->5->16->8->4->2->1", 3)
        );
    }
}