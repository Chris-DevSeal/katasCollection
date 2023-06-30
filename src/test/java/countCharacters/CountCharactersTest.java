package countCharacters;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CountCharactersTest {

    CountCharacters countCharacters = new CountCharacters();

    @ParameterizedTest
    @MethodSource("getInput")
    void count(Map<Character, Integer> expected, String input) {
        Map<Character, Integer> actual = countCharacters.count(input);

        assertEquals(expected, actual);
    }

    Stream<Arguments> getInput() {
        return Stream.of(
                of(Map.of('a', 2, 'b', 1), "aba")
        );
    }
}