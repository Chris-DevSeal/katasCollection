package scramblies;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ScrambliesTest {
    Scramblies scramblies = new Scramblies();

    @ParameterizedTest
    @MethodSource("getInput")
    void scramble(String[] input, boolean expected) {
        boolean actual = scramblies.scramble(input[0], input[1]);

        assertEquals(expected, actual);
    }

    public Stream<Arguments> getInput() {
        return Stream.of(
                of(new String[]{"rkqodlw", "world"}, true),
                of(new String[]{"cedewaraaossoqqyt", "codewars"}, true),
                of(new String[]{"katas", "steak"}, false),
                of(new String[]{"scriptjavx", "javascript"}, false),
                of(new String[]{"scriptingjava", "javascript"}, true),
                of(new String[]{"scriptsjava", "javascripts"}, true),
                of(new String[]{"javscripts", "javascript"}, false),
                of(new String[]{"aabbcamaomsccdd", "commas"}, true),
                of(new String[]{"commas", "commas"}, true),
                of(new String[]{"sammoc", "commas"}, true)
        );
    }
}