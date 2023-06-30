package josephusPermutation;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JosephusPermutationTest {
    JosephusPermutation josephusPermutation = new JosephusPermutation();

    @ParameterizedTest
    @MethodSource("getInput")
    <T> void josephusPermutationKEquals2(List<T> input, List<T> expected) {
        int K_CONSTANT_VAL = 2;
        List<T> actual = josephusPermutation.josephusPermutation(input, K_CONSTANT_VAL);
        System.out.println(actual);

        assertIterableEquals(expected, actual);
    }

    Stream<Arguments> getInput() {
        return Stream.of(
                of(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), List.of(2, 4, 6, 8, 10, 3, 7, 1, 9, 5))
        );
    }
}