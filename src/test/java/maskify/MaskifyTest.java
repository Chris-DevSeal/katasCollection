package maskify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MaskifyTest {
    private final Maskify maskify = new Maskify();

    @ParameterizedTest
    @MethodSource("getMaskify")
    void maskifyTest(String expected, String input) {
        Assertions.assertEquals(expected, maskify.masikfy(input));
    }

    Stream<Arguments> getMaskify() {
        return Stream.of(
                Arguments.of("############5616", "4556364607935616"),
                Arguments.of("#######5616", "64607935616"),
                Arguments.of("1", "1"),
                Arguments.of("", ""),
                Arguments.of("######orld", "helloworld")
        );
    }
}
