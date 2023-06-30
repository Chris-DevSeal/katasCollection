package findTargetSumIndex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FindTargetSumIndexTest {

    private final FindTargetSumIndex findTargetSumIndex = new FindTargetSumIndex();

    @ParameterizedTest
    @MethodSource("getValues")
    void twoSumTest(int[] expected, Map<int[], Integer> input) {
        for (Map.Entry<int[], Integer> integerEntry : input.entrySet()) {
            int[] actual = findTargetSumIndex.twoSum(integerEntry.getKey(), integerEntry.getValue());
            Assertions.assertEquals(Arrays.stream(actual).sum(), Arrays.stream(expected).sum());
        }
    }

    Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(
                        new int[]{0, 1}, Map.of(new int[]{1, 2, 4}, 3)
                ),
                Arguments.of(
                        new int[]{2, 3}, Map.of(new int[]{5, 1, 3, 4}, 7)
                )
        );
    }
}
