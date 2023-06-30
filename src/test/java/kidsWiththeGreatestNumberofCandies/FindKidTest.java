package kidsWiththeGreatestNumberofCandies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FindKidTest {
    private final FindKid findKid = new FindKid();

    @ParameterizedTest
    @MethodSource("getCandiesFromKids")
    void getKidWithMostCandyTest(List<Boolean> expected, Map<int[], Integer> input) {
        for (Map.Entry<int[], Integer> integerEntry : input.entrySet()) {
            Assertions.assertEquals(expected, findKid.getKidWithMostCandies(integerEntry.getKey(), integerEntry.getValue()));
        }
    }

    Stream<Arguments> getCandiesFromKids() {
        return Stream.of(
                Arguments.of(List.of(true, true, true, false),
                        Map.of(
                                new int[]{4, 4, 7, 3}, 3
                        )
                ),
                Arguments.of(List.of(true, true, true),
                        Map.of(
                                new int[]{1, 2, 3}, 3
                        ))
        );
    }
}
