package deadFish;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class DeadFishTest {
    private final DeadFish deadFish = new DeadFish();

    @ParameterizedTest
    @MethodSource("getCommands")
    void parse(int[] expected, String input) {
        assertArrayEquals(expected, deadFish.parse(input));
    }

    Stream<Arguments> getCommands() {
        return Stream.of(
                Arguments.of(new int[]{8, 64}, "iiisdoso"),
                Arguments.of(new int[]{8, 64, 3600}, "iiisdosodddddiso")
        );
    }
}