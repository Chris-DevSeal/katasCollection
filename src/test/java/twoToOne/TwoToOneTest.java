package twoToOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TwoToOneTest {
    private final TwoToOne twoToOne = new TwoToOne();

    @ParameterizedTest
    @MethodSource("getTwoStrings")
    void longestTest(String expected, String[] input) {
        Assertions.assertEquals(expected, twoToOne.longest(input[0], input[1]));
    }

    Stream<Arguments> getTwoStrings() {
        return Stream.of(
                Arguments.of("aehrsty", new String[]{"aretheyhere", "yestheyarehere"}),
                Arguments.of("abcdefghilnoprstu", new String[]{"loopingisfunbutdangerous", "lessdangerousthancoding"}),
                Arguments.of("acefghilmnoprstuy", new String[]{"inmanylanguages", "theresapairoffunctions"})
        );
    }
}
