package findUniqueString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class UniqueStringFinderTest {
    @ParameterizedTest
    @MethodSource("stringList")
    void findUniqueStringTest(List<String> input, String expected) {
        Assertions.assertEquals(expected, UniqueStringFinder.findUniqueString(input));

    }


    static Stream<Arguments> stringList() {
        return Stream.of(
                Arguments.of(List.of("asd", "as", "as", "as"), "asd"),
                Arguments.of(List.of("bc", "bc", "bc", "ks"), "ks")
        );
    }
}
